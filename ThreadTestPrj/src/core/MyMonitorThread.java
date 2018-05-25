package core;

import java.util.concurrent.*;

import javax.swing.JTextArea;

public class MyMonitorThread implements Runnable {
	private ThreadPoolExecutor executor;
	private int seconds;
	private JTextArea areaMonitor;

	private boolean run = true;

	/**
	 * @param delay - interval between report outputs, in seconds
	 */
	public MyMonitorThread(ThreadPoolExecutor executor, int delay) {
		this.executor = executor;
		this.seconds = delay;
	}

	/**
	 * @param area - view item for report output
	 */
	public void setArea(JTextArea area) {
		areaMonitor=area;
	}
	
	public void shutdown() {
		this.run = false;
	}

	@Override
	public void run() {
		while (run) {
			areaMonitor.append((String.format(
					"[monitor] [%d/%d] Active: %d, Completed: %d, Task: %d, isShutdown: %s, isTerminated: %s",
					this.executor.getPoolSize(), this.executor.getCorePoolSize(), this.executor.getActiveCount(),
					this.executor.getCompletedTaskCount(), this.executor.getTaskCount(), this.executor.isShutdown(),
					this.executor.isTerminated()))+"\n");
			try {
				Thread.sleep(seconds * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
