package com.oopz.lab3.task2;

import com.oopz.lab3.utils.AbstractTest;

public class VectorTest extends AbstractTest {

	@Override
	public void startTest() {
		Vector v1 = new Vector(new double[] {5, 0, 3});
		Vector v2 = new Vector(new double[] {0, 5, 3});
		
		VectorChecker checker = new VectorChecker(v1, v2);
		
		System.out.println(checker.areOrthogonal());
		System.out.println(checker.areCollinear());


	}

}
