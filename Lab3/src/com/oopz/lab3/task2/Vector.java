package com.oopz.lab3.task2;

public class Vector {
	private double[] arr;
	
    public Vector() {
        arr = null;
    }

    public Vector(int n) {
        arr = new double[n];
    }

    public Vector(double[] a) {
    	this(a.length);
    	
        for (int i = 0; i < a.length; i++) {
        	arr[i] = a[i];
        }
    }

    public Vector(Vector a) {
    	this(a.arr);
    }
    
    public double getElem(int index) {
    	return arr[index];
    }
    
    public void setElem(int index, double value) {
    	arr[index] = value;
    }
    
    public Vector add(Vector vector) {
        if (this.getSize() != vector.getSize())
            throw new RuntimeException("Cannot sum vectors: sizes are not equal");

        for (int i = 0; i < getSize(); i++)
        	this.setElem(i, this.getElem(i) + vector.getElem(i));

        return this;
    }

    public Vector sub(Vector vector) {
        if (this.getSize() != vector.getSize())
            throw new RuntimeException("Cannot sub vectors: sizes are not equal");

        for (int i = 0; i < getSize(); i++)
        	this.setElem(i, this.getElem(i) - vector.getElem(i));

        return this;
    }
    
    public Vector mul(double val) {

        for (int i = 0; i < getSize(); i++) {
            this.setElem(i, getElem(i) * val);
        }

        return this;
    }
    
    public double getModule() {
    	double result = 0;
    	
    	for (int i = 0; i < getSize(); i++)
			result += (getElem(i) * getElem(i));
    	
    	return Math.sqrt(result);
    }
    
    public double scalar(Vector vector) {
    	
    	double result = 0;
    	
    	for (int i = 0; i < getSize(); i++)
            result += getElem(i) * vector.getElem(i);
    	
    	return result;
    }
    
    public int getSize() {
    	return arr.length;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (obj == this) return true;
    	if (obj == null || (this.getClass() != obj.getClass())) return false;
    	
    	Vector vector = (Vector) obj;
    	
    	if (vector.arr == arr) return true;
    	if (vector.getSize() != getSize()) return false;
    	
    	for (int i = 0; i < getSize(); i++)
			if (getElem(i) != vector.getElem(i)) return false;
		
    	return true;
    }
    
    @Override
    public String toString() {
    	String str = "[ ";
    	
    	for (int i = 0; i < getSize(); i++) {
			str = str + getElem(i) + " ";
		}
    	
    	return str + " ]";
    }
}
