package com.oopz.lab3;

import com.oopz.lab3.task1.CustomerTest;
import com.oopz.lab3.task2.VectorTest;
import com.oopz.lab3.task3.CalendarTest;

public class Main {

	public static CustomerTest customerTest = new CustomerTest();
	public static VectorTest vectorTest = new VectorTest();
	public static CalendarTest calendarTest = new CalendarTest();
	
	public static void main(String[] args) {
		
		customerTest.startTest();
	}
}
