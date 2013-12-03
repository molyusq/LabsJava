package com.oopz.lab3.task5;

public class Complex {

	private double r;
	private double z;

	public Complex() {
		r = 0;
		z = 0;
	}

	public Complex(Complex c) {
		r = c.r;
		z = c.z;
	}
	
	public Complex(double r, double z) {
		this.r = r;
		this.z = z;
	}

	public Complex add(Complex c) {
		this.r += c.r;
		this.z += c.z;
		return this;
	}

	public Complex mul(Complex c) {
		r = r * c.r - z * c.z;
		z = r * c.z + z * c.r;
		return this;
	}

	public Complex mul(double val) {
		return mul(new Complex(val, 0));
	}

	public Complex pow(int power) {
		
		if (power < 0) throw new ArithmeticException("pow with negative power is not supported");
		
		if (power == 0) {
			r = 1;
			z = 0;
		} else
			for (int i = 0; i < power - 1; i++)
				mul(this);

		return this;
	}

	@Override
	public String toString() {
		return "(" + r + ", " + z + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || (this.getClass() != obj.getClass()))
			return false;

		Complex c = (Complex) obj;

		if (r != c.r || z != c.z)
			return false;

		return true;
	}
}
