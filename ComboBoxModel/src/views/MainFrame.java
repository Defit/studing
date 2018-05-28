package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import actions.ClickListener;
import model.Person;
import model.PersonComboBoxModel;


/**
 * Form containing a panel with a grid of 1:3, in which there are 3 panels with grids of 2:1<br>
 * Each of the three internal panels contains a button(index : 1) and a ComboBox(index : 0)<br>
 * The panels have the following names:<br>
 * "MainPanel" in JFrame<br>
 * Internal panels in MainPanel:<br>
 * "PanelOne"   greed index : 0<br>
 * "PanelTwo"   greed index : 1<br>
 * "PanelThree" greed index : 2
 */
public class MainFrame extends JFrame {
	private static final long serialVersionUID = 5398032942924976106L;
	private static String name = "Views -> Controllers in XML";
	
	private JPanel mainPanel;
	private JPanel panelOne;
	private JPanel panelTwo;
	private JPanel panelThree;


	public MainFrame() {
		super(name);
		this.setPreferredSize(new Dimension(900, 400));
		this.setLayout(new BorderLayout());
		
		
		mainPanel=new JPanel(new GridLayout(1, 3));
		mainPanel.setName("MainPanel");
		panelOne=new JPanel(new GridLayout(2, 1));
		panelOne.setName("PanelOne");
		panelTwo=new JPanel(new GridLayout(2, 1));
		panelTwo.setName("PanelTwo");
		panelThree=new JPanel(new GridLayout(2, 1));
		panelThree.setName("PanelThree");
		
		JButton button=new JButton("ButtonOne");
		button.addActionListener(new ClickListener());
		
		JComboBox<String> comboBox=new JComboBox<String>(
				new PersonComboBoxModel(Person.getExample()));
		
		panelOne.add(button);
		panelOne.add(comboBox);
		
		button=new JButton("ButtonTwo");
		button.addActionListener(new ClickListener());
		comboBox=new JComboBox<String>(
				new PersonComboBoxModel(Person.getExample2()));
		panelTwo.add(button);
		panelTwo.add(comboBox);
		
		button=new JButton("ButtonThree");
		button.addActionListener(new ClickListener());
		comboBox=new JComboBox<String>(
				new PersonComboBoxModel(Person.getExample3()));
		panelThree.add(button);
		panelThree.add(comboBox);
		
		mainPanel.add(panelOne);
		mainPanel.add(panelTwo);
		mainPanel.add(panelThree);
		
		this.add(mainPanel);
		this.pack();
		this.setVisible(true);
	}
}
