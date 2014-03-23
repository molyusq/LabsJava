package com.oopz.lab5.task1;


public class FirstOddAdder implements MeasurementsProcessor {
	
	private MeasurementsHolder measurementsHolder;
	
	public FirstOddAdder() {
		this(null);
	}
	
	public FirstOddAdder(MeasurementsHolder measurementsHolder) {
		this.measurementsHolder = measurementsHolder;
	}
	
	@Override
	public MeasurementsHolder process() {
		MeasurementsHolder result = new MeasurementsHolder(measurementsHolder.toArray()); 
		
		int firstOdd = lookupFirstOdd();
		
		for (int i = 0; i < measurementsHolder.getSize(); i++) {
			result.setValue(i, measurementsHolder.getValue(i) + firstOdd);
		}
		
		return result;
	}
	
	private int lookupFirstOdd() {
		for (int i = 0; i < measurementsHolder.getSize(); i++) {
			if (Math.abs(measurementsHolder.getValue(i)) % 2 != 0) 
				return measurementsHolder.getValue(i);
		}
		
		return 0;
	}

	public MeasurementsHolder getMeasurementsHolder() {
		return measurementsHolder;
	}

	public void setMeasurementsHolder(MeasurementsHolder measurementsHolder) {
		this.measurementsHolder = measurementsHolder;
	}
}
