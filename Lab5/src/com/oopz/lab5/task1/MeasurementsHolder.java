package com.oopz.lab5.task1;

import java.util.Arrays;
import java.util.Random;

public class MeasurementsHolder {
	
	private int[] measurements;
	
	public MeasurementsHolder() {
		this(0);
	}
	
	public MeasurementsHolder(int measurementsCount) {
		measurements = new int[measurementsCount];
	}
	
	public void initMeasurements(int min, int max) {
		Random random = new Random();
		
		for (int i = 0; i < measurements.length; i++) {
			measurements[i] = random.nextInt((max - min) + 1) + min;
		}
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
	
	public MeasurementsHolder process() {
		MeasurementsHolder result = new MeasurementsHolder();
		result.measurements = Arrays.copyOf(measurements, measurements.length); 
		
		int firstOdd = lookupFirstOdd();
		
		for (int i = 0; i < measurements.length; i++)
			result.measurements[i] += firstOdd;
		
		return result;
	}
	
	private int lookupFirstOdd() {
		for (int measurement : measurements)
			if (Math.abs(measurement) % 2 != 0) return measurement;
		
		return 0;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		
		return  prime + Arrays.hashCode(measurements);
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
