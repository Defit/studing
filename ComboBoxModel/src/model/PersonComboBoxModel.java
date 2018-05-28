package model;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 * A model for wrapping a Person object in a ÑomboBox
 */
public class PersonComboBoxModel implements ComboBoxModel<String> {

	private Person person;
	private Object selectedItem;

	public PersonComboBoxModel(Person person) {
		this.person = person;
		selectedItem = person.getFamily();
	}

	/**
	 * It is necessary to implement in case of adding a selection event
	 */
	public void addListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * It is necessary to implement in case of adding a selection event
	 */
	public void removeListDataListener(ListDataListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getElementAt(int i) {
		// TODO Auto-generated method stub
		switch (i) {
		case 0:
			return person.getName();
		case 1:
			return person.getFamily();
		case 2:
			return (person.dateFormat.format(person.getDate())).toString();
		default:
			return person.getName();
		}
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public Object getSelectedItem() {
		// TODO Auto-generated method stub
		return selectedItem;
	}

	@Override
	public void setSelectedItem(Object newValue) {
		// TODO Auto-generated method stub
		selectedItem=newValue;
	}

}
