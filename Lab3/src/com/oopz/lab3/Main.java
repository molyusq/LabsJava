package com.oopz.lab3;

import com.oopz.lab3.task1.Customer;
import com.oopz.lab3.task2.Vector;
import com.oopz.lab3.task2.VectorChecker;

public class Main {
//	Customer customer1 = new Customer(1, "Palianytsia", "Oleh", "V.", "Kovalskyy 5/417", 1, 1);
//	Customer customer2 = new Customer(2, "Zhuck", "Andrew", "C.", "Kovalskyy 5/420", 2, 43);
//	Customer customer3 = new Customer(5, "Hadyniack", "Rus", "A.", "Kovalskyy 5/420", 3, 54);
	
	public static void main(String[] args) {
		Vector v1 = new Vector(new double[] {5, 0, 3});
		Vector v2 = new Vector(new double[] {0, 5, 3});
		
		VectorChecker checker = new VectorChecker(v1, v2);
		
		System.out.println(checker.areOrthogonal());
	}
}
