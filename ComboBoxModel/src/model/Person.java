package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	private String name;
	private String family;
	private Date date;
	SimpleDateFormat dateFormat;
	
	/**
	 * 
	 * @param name - Person name
	 * @param family - Person family
	 * @param date - Date of birth in format : dd/MM/yyyy
	 * Example : 27/09/2009
	 */
	public Person(String name,String family,String date) {
		dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		this.name=name;
		this.family=family;
		try {
			this.date=dateFormat.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	/*
	 * methods GET/SET necessary for working castor
	 * =================================================
	 */
	public String getName() {
		return name;
	}
	
	public String getFamily() {
		return family;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setFamily(String family) {
		this.family=family;
	}
	
	public void setDate(Date date) {
		this.date=date;
	}
	/*=================================================*/
	
	/*
	 * Generate example objects
	 * =================================================
	 */
	public static Person getExample() {
		return new Person("Alexey", "Volkov", "20/11/1975");
	}
	
	public static Person getExample2() {
		return new Person("Ivan", "Grozniy", "03/09/1530");
	}
	
	public static Person getExample3() {
		return new Person("David", "Copperfield", "16/09/1956");
	}
	/*=================================================*/
}
