package com.oopz.lab3.task7;

public class Student { 

	private String university;
	private String name;
	private String surname;
	private int averageMark;
	
	public Student() {
		university = "";
		name = "";
		surname = "";
		averageMark = -1;
	}
	
	public Student(String university, String name, String surname, int averageMark) {
		this.university = university;
		this.name = name;
		this.surname = surname;
		this.averageMark = averageMark;
	}
	
	public String getUniversity() {
		return university;
	}
	
	public void setUniversity(String university) {
		this.university = university;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getAverageMark() {
		return averageMark;
	}
	
	public void setAverageMark(int averageMark) {
		this.averageMark = averageMark;
	}
}
