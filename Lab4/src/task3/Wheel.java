package task3;

public class Wheel {
	
	private double diameter;
	private boolean isStepney;
	
	public Wheel(double diameter, boolean isStepney) {
		this.diameter = diameter;
		this.isStepney = isStepney;
	}
	
	public double getDiameter() {
		return diameter;
	}
	public boolean getStatus() {
		return isStepney;
	}
	
	public void spin() {
		System.out.println("Wheel is spinning!");
	}
	
	public void changeWheel(Wheel wheel) {
		if(wheel.isStepney && !this.isStepney) {
			this.diameter = wheel.diameter;
			this.isStepney = wheel.isStepney;
			wheel.isStepney = false;
			System.out.println("Wheel was changed.");
		}
		else System.out.println("Wheel can't be changed.");
	}
	
	@Override
	public boolean equals(Object object) {
		if(this==object)
			return true;
		if(object != null && object instanceof Wheel) {
			Wheel another = (Wheel) object;
			return diameter == another.diameter && isStepney == another.isStepney;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		final int coef = 11; 
		return coef + (int)Math.round(diameter);
	}
	
	@Override
	public String toString() {
		return getClass().getName() + " [diameter=" + diameter + ", isStepney=" + isStepney +"]";
	}
}
