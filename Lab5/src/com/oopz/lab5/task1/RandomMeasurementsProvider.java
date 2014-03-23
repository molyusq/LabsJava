package com.oopz.lab5.task1;

import java.util.Random;

public class RandomMeasurementsProvider implements MeasurementsProvider {
	
	private int minRange;
	private int maxRange;
	private int measurementsCount;
	
	
	public RandomMeasurementsProvider() {
		this(0, 0, 0);
	}
	
	public RandomMeasurementsProvider(int minRange, int maxRange, int measurementsCount) {
		this.minRange = minRange;
		this.maxRange = maxRange;
		this.measurementsCount = measurementsCount;
	}
	
	@Override
	public MeasurementsHolder getMeasurements() {
		
		MeasurementsHolder measurementsHolder = new MeasurementsHolder(measurementsCount); 
		
		Random random = new Random();
		
		for (int i = 0; i < measurementsCount; i++) {
			measurementsHolder.setValue(i, random.nextInt((maxRange - minRange) + 1) + minRange);
		}
		
		return measurementsHolder;
	}

	public int getMinRange() {
		return minRange;
	}

	public void setMinRange(int minRange) {
		this.minRange = minRange;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public int getMeasurementsCount() {
		return measurementsCount;
	}

	public void setMeasurementsCount(int measurementsCount) {
		this.measurementsCount = measurementsCount;
	}

}
