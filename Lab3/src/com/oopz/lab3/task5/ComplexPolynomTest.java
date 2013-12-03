package com.oopz.lab3.task5;

import com.oopz.lab3.utils.AbstractTest;

public class ComplexPolynomTest implements AbstractTest {

	@Override
	public void startTest() {
		Complex c1 = new Complex(1, 1);
		Complex c2 = new Complex(2, 1);
		Complex c3 = new Complex(2, 2);
		
		ComplexPolynom polynom = new ComplexPolynom(c1, c2, c3);
		
		System.out.println(polynom.eval(new Complex(1, 5)));
	}

}
