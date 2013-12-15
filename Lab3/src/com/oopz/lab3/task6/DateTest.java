package com.oopz.lab3.task6;

import java.util.Calendar;

public class DateTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		ExtendedDate date = new ExtendedDate(calendar);
		
		System.out.println("Current season is: " + date.getSeason());
	}

}
