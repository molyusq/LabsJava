package com.oopz.lab3.task7;

import com.oopz.lab3.task1.Customer;

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
	
	public void setInt(int averageMark) {
		this.averageMark = averageMark; 
	}
	
	public String getUniversity() {
		return university;
	}
	
	public void setStrings(String surname, String name, String university) {
		this.name = name;
		this.surname = surname;
		this.university = university;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public int getAverageMark() {
		return averageMark;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null || (obj.getClass() != this.getClass())) return false;
		
		Student student = (Student) obj;
		
		return university.equals(student.university) &&
				surname.equals(student.surname) &&
				name.equals(student.name) &&
				averageMark == student.averageMark;
	}
}
