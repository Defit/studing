package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import actions.ClickStart;

/**
 * Form 500x500, consisting of two text areas and one button.
 * The button is attached to the ClickStart event
 */
public class MainFrame extends JFrame {
	private static final long serialVersionUID = 5398032942924976106L;
	private static String name = "Thread Views";
	private JTextArea areaMonitor;
	private JTextArea areaThreads;
	private JButton startButton;
	private JPanel panel;

	public MainFrame() {
		super(name);
		this.setPreferredSize(new Dimension(500, 500));
		this.setLayout(new BorderLayout());
		
		startButton=new JButton("Start");
		startButton.addActionListener(new ClickStart());
		
		areaMonitor=new JTextArea();
		areaMonitor.setForeground(Color.BLACK);
		areaMonitor.setName("threads monitor");
		
		areaThreads=new JTextArea();
		areaThreads.setForeground(Color.BLACK);
		areaThreads.setName("threads area");
		
		panel=new JPanel(new GridLayout(2, 2));
		panel.add(areaThreads);
		panel.add(areaMonitor);
		panel.add(startButton);
		this.add(panel);
		this.pack();
		this.setVisible(true);
	}
}
