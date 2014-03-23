package com.oopz.lab5.task1;

import java.util.Arrays;

public class MeasurementsHolder {
	
	private int[] measurements;
	
	public MeasurementsHolder() {
		this(0);
	}
	
	public MeasurementsHolder(int measurementsCount) {
		measurements = new int[measurementsCount];
	}
	
	public MeasurementsHolder(int[] measurements) {
		this.measurements = Arrays.copyOf(measurements, measurements.length);
	}
	
	public int getValue(int index) {
		return measurements[index];
	}
	
	public void setValue(int index, int value) {
		measurements[index] = value;
	}
	
	public int getSize() {
		return measurements.length;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		
		return  prime + Arrays.hashCode(measurements);
	}
	
	public int[] toArray() {
		return Arrays.copyOf(measurements, measurements.length);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		MeasurementsHolder other = (MeasurementsHolder) obj;
		if (!Arrays.equals(measurements, other.measurements)) return false;
		
		return true;
	}

	@Override
	public String toString() {
		String result = "[ ";
		
		for (int measurement : measurements)
			result += measurement + " ";
		
		return result + "]";
	}
}
