package com.oopz.lab3.task6;

import java.util.Calendar;
import java.util.Date;

public class ExtendedDate extends Date {
	private static final long serialVersionUID = -2574567852664704561L;
	
	public ExtendedDate(Calendar calendar) {
		super(calendar.getTime().getTime());
	}
	
	public int getSeason() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(this);
		
		int month = calendar.get(Calendar.MONTH);
		
		return (month <= 2) ? 0 :
			    (month > 2 && month <= 5) ? 1 :
			    (month > 5 && month <= 8) ? 2 : 3;
	}
}
