package com.oopz.lab3.task3;

import com.oopz.lab3.utils.AbstractTest;

public class CalendarTest implements AbstractTest {
	
	private int dayInMonth = 17;
	private int dayInweek = 3;
	
	
	@Override
	public void startTest() {
		
		Calendar[] yearCalendar = new Calendar[12];
		
		for (int i = 0; i < yearCalendar.length; i++) yearCalendar[i] = new Calendar();
		
		int startDayOfWeek = 0;
		startDayOfWeek = yearCalendar[0].init(startDayOfWeek, 31);
		startDayOfWeek = yearCalendar[1].init(startDayOfWeek, 28);
		startDayOfWeek = yearCalendar[2].init(startDayOfWeek, 31);
		startDayOfWeek = yearCalendar[3].init(startDayOfWeek, 30);
		startDayOfWeek = yearCalendar[4].init(startDayOfWeek, 31);
		startDayOfWeek = yearCalendar[5].init(startDayOfWeek, 30);
		startDayOfWeek = yearCalendar[6].init(startDayOfWeek, 30);
		startDayOfWeek = yearCalendar[7].init(startDayOfWeek, 31);
		startDayOfWeek = yearCalendar[8].init(startDayOfWeek, 30);
		startDayOfWeek = yearCalendar[9].init(startDayOfWeek, 31);
		startDayOfWeek = yearCalendar[10].init(startDayOfWeek, 30);
		startDayOfWeek = yearCalendar[11].init(startDayOfWeek, 31);
		
		
		System.out.println("For date " + dayInMonth + " day of week is " + yearCalendar[0].getDayOfWeekForDate(dayInMonth));
		
		Selector<Date> iterator = yearCalendar[0].getDatesForDayInWeek(3);
		
		System.out.println("For day in week " + dayInweek + " dates are:");
		
		iterator.next();
		while(!iterator.atEnd()) {
			System.out.print(iterator.current().getDayInMonth() + " ");
			iterator.next();
		}
	}

}
