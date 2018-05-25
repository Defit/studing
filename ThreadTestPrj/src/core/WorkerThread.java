package core;

import javax.swing.JTextArea;

public class WorkerThread implements Runnable {

	private String command;
	private JTextArea areaThread;

	public WorkerThread(String s) {
		this.command = s;
	}

	/**
	 * @param area - view item for report output
	 */
	public void setArea(JTextArea area) {
		areaThread = area;
	}

	@Override
	public void run() {
		synchronized (areaThread) {
		areaThread.append(Thread.currentThread().getName() + " Start. Command = " + command+System.lineSeparator());
		}
		processCommand();
		synchronized (areaThread) {
		areaThread.append(Thread.currentThread().getName() + " End."+System.lineSeparator());
		}
	}

	private void processCommand() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return this.command;
	}

}
