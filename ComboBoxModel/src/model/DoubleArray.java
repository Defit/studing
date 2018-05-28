package model;

/**
 * Dinamic double array
 */
public class DoubleArray {
	private String[] panelsNames;
	private String[] methodsNames;
	private int size;
	private int lenght;

	/**
	 * Empty constructor for castor
	 */
	public DoubleArray() {}
	
	/**
	 * @param startSize -fixed initial size of arrays
	 */
	public DoubleArray(int startSize) {
		size = startSize;
		panelsNames = new String[size];
		methodsNames = new String[size];
		
		lenght = 0;
	}

	/**
	 * Binding an Element to a Controller
	 * @param panel - panels name
	 * @param method - methods name of the controller 
	 * that processes a button click on the specified panel
	 */
	public void add(String panel, String method) {
		if (panelsNames.length <= lenght) {
			size+=1;
			String[] panelsCopy = new String[size];
			String[] methodsCopy = new String[size];
			
			int i = 0;
			for (String element : methodsNames) {
				methodsCopy[i] = element;
				i++;
			}

			i = 0;
			for (String element : panelsNames) {
				panelsCopy[i] = element;
				i++;
			}
			panelsNames = panelsCopy;
			methodsNames = methodsCopy;
		}
		panelsNames[lenght] = panel;
		methodsNames[lenght] = method;
		lenght++;

	}
	
	/**
	 * @param panel - panels name
	 * @return methods name associated with this panel
	 */
	public String getMethod(String panel) {
		int index = 0;
		for(String panelName : panelsNames) {
			if(panelName.equals(panel))
				return methodsNames[index];
			index++;
		}
		return null;
	}

	/*
	 * methods GET/SET necessary for working castor
	 * =================================================
	 */
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public String[] getPanelsNames() {
		return panelsNames;
	}

	public void setPanelsNames(String[] panelsNames) {
		this.panelsNames = panelsNames;
	}

	public String[] getMethodsNames() {
		return methodsNames;
	}

	public void setMethodsNames(String[] methodsNames) {
		this.methodsNames = methodsNames;
	}
	/*=================================================*/
}
