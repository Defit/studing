package controllers;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JTextArea;

import core.MyMonitorThread;
import core.RejectedExecutionHandlerImpl;
import core.WorkerThread;


/**
 * Controller with the ability to run in a separate thread, 
 * performing the task of creating multiple threads and outputting 
 * their work report to views elements
 */
public class StartController implements Runnable{
	public JTextArea outputAreaThreads;
	public JTextArea outputAreaMonitor;
	public JButton startButton;
	
	/**
	 * @param outputAreaThreads - View element for report output, 
	 * which will be passed to each runned thread
	 * @param outputAreaMonitor - View element for a general report 
	 * on the status of all previously running threads
	 */
	public void setAreas(JTextArea outputAreaThreads,JTextArea outputAreaMonitor) {
		this.outputAreaThreads=outputAreaThreads;
		this.outputAreaMonitor=outputAreaMonitor;
	}
	
	/**
	 * @param startButton - Button is sent to block when working threads
	 */
	public void setButton(JButton startButton) {
		this.startButton=startButton;
	}
	
	/**
	 * The method starts the threads and passes them the areas for report output. 
	 * It also blocks the button while the execution.
	 */
	private void printToView(JTextArea areaThreads, JTextArea areaMonitor) throws InterruptedException {
	    areaThreads.setText("");
	    areaMonitor.setText("");
		startButton.setEnabled(false);
		//RejectedExecutionHandler implementation
        RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();
        rejectionHandler.setArea(areaThreads);
        //Get the ThreadFactory implementation to use
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        
        //creating the ThreadPoolExecutor
        ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2, 4, 10, 
        		TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), threadFactory, 
        		rejectionHandler);
        
        //start the monitoring thread
        MyMonitorThread monitor = new MyMonitorThread(executorPool, 3);
        monitor.setArea(areaMonitor);
        Thread monitorThread = new Thread(monitor);
        monitorThread.start();

        //monitorThread.
        //submit work to the thread pool
        for(int i=0; i<10; i++){
			WorkerThread workerThread=new WorkerThread("cmd" + i);
			workerThread.setArea(areaThreads);
            executorPool.execute(workerThread);
        }
        Thread.sleep(30000);
        
        //shut down the pool
        executorPool.shutdown();
        
        Thread.sleep(5000);
        
        //shut down the monitor thread
        monitor.shutdown();
        startButton.setEnabled(true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			printToView(outputAreaThreads, outputAreaMonitor);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
