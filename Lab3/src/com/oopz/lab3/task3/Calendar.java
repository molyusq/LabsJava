package com.oopz.lab3.task3;

public class Calendar {
	
	private Date[] dates;
	
	public Calendar() {
		dates = null;
	}
	
	public Calendar(int startDayOfWeek, int numberOfDaysInMonth) {
		init(startDayOfWeek, numberOfDaysInMonth);
	}
	
	public int init(int startDayOfWeek, int numberOfDaysInMonth) {
		dates = new Date[numberOfDaysInMonth];
		
		for (int i = 0; i < numberOfDaysInMonth; i++) {
			dates[i] = new Date(i, (startDayOfWeek > 6) ? startDayOfWeek = 0 : startDayOfWeek++);
		}
		
		return startDayOfWeek;
	}
	
	public int getDayOfWeekForDate(int dayInMonth) {
		for (Date date : dates) 
			if (date.getDayInMonth() == dayInMonth) return date.getDayInWeek();
		
		throw new RuntimeException("No such day " + dayInMonth + " in calendar");
	}
	
	public Selector<Date> getDatesForDayInWeek(final int dayInWeek) {
		return new Selector<Date>() {
			private int currentIndex = -1;
			
			@Override
			public void next() {
				currentIndex++;
				if (currentIndex < dates.length && dates[currentIndex].getDayInWeek() != dayInWeek) next();
			}
			
			@Override
			public boolean atEnd() {
				return currentIndex >= dates.length; 
			}
			
			@Override
			public Date current() {
				return dates[currentIndex];
			}
		};
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null || (obj.getClass() != this.getClass())) return false;
		
		Calendar calendar = (Calendar) obj;
		if (calendar.dates == dates) return true;
		if (calendar.dates.length != dates.length) return false;
		
		for (int i = 0; i < dates.length; i++)
			if (!dates[i].equals(calendar.dates[i])) return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		for(Date date : dates) builder.append(date.toString()).append(" ");
		
		return builder.toString();
	}
}
