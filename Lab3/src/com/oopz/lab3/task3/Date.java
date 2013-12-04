package com.oopz.lab3.task3;

public class Date {
	
	private int dayInMonth;
	private int dayInWeek;
	
	public Date() {
		dayInMonth = 0;
		dayInWeek = 0;
	}
	
	public Date(int dayInMonth, int dayInWeek) {
		this.dayInMonth = dayInMonth;
		this.dayInWeek = dayInWeek;
	}

	public int getDayInMonth() {
		return dayInMonth;
	}

	public void setDayInMonth(int dayInMonth) {
		this.dayInMonth = dayInMonth;
	}

	public int getDayInWeek() {
		return dayInWeek;
	}

	public void setDayInWeek(int dayInWeek) {
		this.dayInWeek = dayInWeek;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null || (obj.getClass() != this.getClass())) return false;
		
		Date date = (Date) obj;
		
		return dayInMonth == date.dayInMonth && dayInWeek == date.dayInWeek;
	}
	
	@Override
	public String toString() {
		return dayInMonth + ", " + dayInWeek;
	}
}
