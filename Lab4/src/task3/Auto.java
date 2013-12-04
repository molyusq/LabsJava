package task3;

import java.util.ArrayList;
import java.util.Random;

public class Auto {
	private String mark;
	private ArrayList<Wheel> wheelList = new ArrayList<Wheel>();
	private double fuelReserve = 0;
	private double fuelTankSize;
	
	public Auto(String mark, double fuelTankSize, double diameter) {
		this.mark = mark;
		this.fuelTankSize = fuelTankSize;
		for(int i=0;i<4;i++)
			wheelList.add(new Wheel(diameter, false));
		wheelList.add(new Wheel(diameter, true));
	}
	
	public void go() {
		int wheelCount = 0;
		for(Wheel wheel : wheelList)
			if(!wheel.getStatus()) {
				wheel.spin();
				wheelCount++;
			}
		if(wheelCount != 4)
			System.out.println("Auto can't move.");
		else {
			fuelReserve -= 10;
			System.out.println("Auto is moving...");
		}
	}
	
	public void changeWheel() {
		Random r = new Random();
		int index = r.nextInt(4);
		Wheel source = wheelList.get(index);
		Wheel destination = wheelList.get(4);
		source.changeWheel(destination);
	}
	
	public void refuel(double amount) {
		System.out.println("Refuel...");
		if(amount + fuelReserve > fuelTankSize)
			fuelReserve = fuelTankSize;
		else fuelReserve += amount;
		System.out.println("Done.");
	}
	
	public void showMark() {
		System.out.println("Mark: " + mark);
	}
	
	@Override
	public int hashCode() {
		final int coef = 11;
		return coef + (int)Math.round(fuelTankSize) + (int)Math.round(fuelReserve);
	}
	
	@Override
	public boolean equals(Object object) {
		if(this == object)
			return true;
		if(object != null && object instanceof Auto) {
			Auto another = (Auto) object;
			return mark.equals(another.mark) && wheelList.equals(another.wheelList) && fuelTankSize == another.fuelTankSize && fuelReserve == another.fuelReserve;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return getClass().getName() + " [mark=" + mark +", wheelList=" + wheelList.toString() + ", fuelReserve=" + fuelReserve + ", fuelTankSize=" + fuelTankSize + "]"; 
	}
}
