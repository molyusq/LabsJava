package com.oopz.lab3.task2;

public class VectorChecker {
	private Vector vector1;
	private Vector vector2;
	
	public VectorChecker() {
		vector1 = null;
		vector2 = null;
	}
	
	public VectorChecker(Vector v1, Vector v2) {
		vector1 = v1;
		vector2 = v2;
	}
	
	public boolean areOrthogonal() {
		return vector1.scalar(vector2) == 0;
	}
	
	public boolean areCollinear() {
		return 	Math.abs(vector1.scalar(vector2)) == Math.abs(vector1.getModule() * vector2.getModule());
	}
	
	@Override
	public boolean equals(Object obj) {
    	if (obj == this) return true;
    	if (obj == null || (this.getClass() != obj.getClass())) return false;
    	
    	VectorChecker checker = (VectorChecker) obj;
    	
    	if (vector1 == checker.vector1 && vector2 == checker.vector2) return true;
    	
    	return (vector1.equals(checker.vector1) && vector2.equals(checker.vector2));
	}
}
