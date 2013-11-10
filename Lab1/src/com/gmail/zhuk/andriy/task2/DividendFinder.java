package com.gmail.zhuk.andriy.task2;

import java.util.ArrayList;

public class DividendFinder {
	private ArrayList<Integer> list;
	private int firstDivider;
	private int secondDivider;
	
	public DividendFinder(ArrayList<Integer> list) {
		this.list = list;
		this.firstDivider = firstDivider;
		this.secondDivider = secondDivider;
	}
	
	public boolean isDividend(int dividend) {
		return dividend % this.firstDivider == 0 || dividend % this.secondDivider == 0;
	}
}
