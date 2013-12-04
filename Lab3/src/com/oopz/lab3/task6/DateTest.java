package com.oopz.lab3.task6;

import java.util.Calendar;

import com.oopz.lab3.utils.AbstractTest;

public class DateTest implements AbstractTest {

	@Override
	public void startTest() {
		Calendar calendar = Calendar.getInstance();
		
		ExtendedDate date = new ExtendedDate(calendar);
		
		System.out.println("Current season is: " + date.getSeason());
	}

}
