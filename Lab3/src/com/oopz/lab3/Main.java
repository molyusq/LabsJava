package com.oopz.lab3;

import com.oopz.lab3.task1.CustomerTest;
import com.oopz.lab3.task2.VectorTest;
import com.oopz.lab3.task3.CalendarTest;
import com.oopz.lab3.task4.TextElementTest;
import com.oopz.lab3.task5.ComplexPolynomTest;
//import com.oopz.lab3.task3.CalendarTest;
import com.oopz.lab3.task6.DateTest;

public class Main {

	public static CustomerTest customerTest = new CustomerTest();
	public static VectorTest vectorTest = new VectorTest();
	public static TextElementTest textElementTest = new TextElementTest();
	public static ComplexPolynomTest complexPolynomTest = new ComplexPolynomTest();
	public static DateTest dateTest = new DateTest();
	public static CalendarTest calendarTest = new CalendarTest();
	
	public static void main(String[] args) {
		
		calendarTest.startTest();
	}
}
