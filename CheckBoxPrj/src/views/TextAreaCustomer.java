package views;

import javax.swing.JTextArea;

public class TextAreaCustomer extends JTextArea {

	public TextAreaCustomer(String text) {
		super(text);
		this.setRows(1);
		this.setColumns(1);
		this.setEnabled(false);
	}
}
