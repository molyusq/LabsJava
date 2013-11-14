package com.gmail.zhuk.andriy.task2;

import java.util.ArrayList;

public class DividendFinder {
	private ArrayList<Integer> inputList;
	private int firstDivider;
	private int secondDivider;
	
	public DividendFinder(int firstDivider, int secondDivider) {
		inputList = new ArrayList<Integer>();
		this.firstDivider = firstDivider;
		this.secondDivider = secondDivider;
	}
	
	public boolean isDividend(int dividend) {
		return dividend % this.firstDivider == 0 || dividend % this.secondDivider == 0;
	}
	public void add(Object object) {
		inputList.add((Integer) object);
	}
	
	public ArrayList<Integer> findDividends() {
		ArrayList<Integer> dividendList = new ArrayList<Integer>();
		for(int i = 0; i < inputList.size(); i++) {
			if(isDividend(inputList.get(i))) {
				dividendList.add(inputList.get(i));
			}
		}
		return dividendList;
	}
	
	public String toString() {
		return getClass().getName() + "[inputList =" + inputList.toString() + ", firstDivider=" + firstDivider + ", secondDivider=" + secondDivider + "]";
	}
	
	public boolean equals(Object object) {
		if(object == this) {
			return true;
		}
		if(object != null && object instanceof DividendFinder) {
			DividendFinder other = (DividendFinder) object;
			return inputList.equals(other.inputList) && firstDivider == other.firstDivider && secondDivider == other.secondDivider;
		}
		return false;
	}
}
