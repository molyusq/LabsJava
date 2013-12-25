package com.oopz.lab3.task7;

public class GroupMate extends Student {
	
	private String telephoneNumber;
	private String adress;

	public GroupMate() {
		telephoneNumber = "";
		adress = "";
	}
	
	public GroupMate(String university, String name, String surname, int averageMark, String telephoneNumber, String adress) {
		super(university, name, surname, averageMark);
		this.telephoneNumber = telephoneNumber;
		this.adress = adress;
	}
	
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	
	public void setStrings(String surname, String name, String university, String telephoneNumber, String adress) {
		super.setStrings(surname, name, university);
		this.telephoneNumber = telephoneNumber;
		this.adress = adress;
	}
	
	public String getAdress() {
		return adress;
	}
}
