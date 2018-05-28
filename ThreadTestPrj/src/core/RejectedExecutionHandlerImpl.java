package core;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

import javax.swing.JTextArea;

public class RejectedExecutionHandlerImpl implements RejectedExecutionHandler {

	private JTextArea outputArea;
	
	/**
	 * @param outputArea - view item for report output
	 */
	public void setArea(JTextArea outputArea) {
		this.outputArea=outputArea;
	}
	
	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		// TODO Auto-generated method stub
		outputArea.append((r.toString() + " is rejected")+System.lineSeparator());
	}

}
