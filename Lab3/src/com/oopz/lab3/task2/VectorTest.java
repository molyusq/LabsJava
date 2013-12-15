package com.oopz.lab3.task2;

public class VectorTest {
	public static void main(String[] args) {
		Vector v1 = new Vector(new float[] {5, 0, 0});
		Vector v2 = new Vector(new float[] {0, 5, 0});
		
		VectorChecker checker = new VectorChecker(v1, v2);
		
		System.out.println(checker.areOrthogonal());
		System.out.println(checker.areCollinear());


	}

}
