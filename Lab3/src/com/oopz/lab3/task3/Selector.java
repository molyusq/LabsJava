package com.oopz.lab3.task3;

public interface Selector <T> {
	boolean atEnd();
	T current();
	void next();
}
