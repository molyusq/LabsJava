package com.oopz.lab3.task5;

public class ComplexPolynom {
	
	private Complex[] coefs;
	
	public ComplexPolynom() {
		coefs = null;
	}
	
	public ComplexPolynom(Complex... coefs) {
		this.coefs = coefs;
	}
	
	public Complex eval(Complex val) {
		
		Complex result = new Complex(0, 0);
		Complex acc = new Complex(1, 0);
		
		for (int i = coefs.length - 1, pow = 0; i >= 0; i--, pow++) {
			if (pow > 0) acc.mul(val);
			result.add(new Complex(coefs[i]).mul(acc));
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		
		String result = "";
		
		for (int i = 0, pow = coefs.length - 1; i < coefs.length; i++, pow--) {
			result += (pow > 0) 
					  ? coefs[i].toString() + " * x" + ((pow == 1) ? "" : " ^ " + pow) + " + "  
				      : coefs[i].toString();
		}
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || (this.getClass() != obj.getClass()))
			return false;

		ComplexPolynom polynom = (ComplexPolynom) obj;
		
		if (polynom.coefs == coefs) return true;
		if (polynom.coefs.length != coefs.length) return false;
		
		for (int i = 0; i < coefs.length; i++)
			if (!coefs[i].equals(polynom.coefs[i])) return false;
		
		
		return true;
		
	}
}
