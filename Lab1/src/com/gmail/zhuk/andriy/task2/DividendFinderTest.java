package com.gmail.zhuk.andriy.task2;

public class DividendFinderTest {
	public static void main(String[] args) {
		DividendFinder finder = new DividendFinder(3, 9);
		DividendFinder sameFinder = new DividendFinder(3, 9);
		DividendFinder anotherFinder = new DividendFinder(3, 9);
		UserInputHandler handler = new UserInputHandler(finder);
		UserInputHandler sameHandler = new UserInputHandler(finder);
		UserInputHandler anotherHandler = new UserInputHandler(anotherFinder);
		handler.handleInput();
		System.out.println(finder.toString());
		System.out.println(handler.toString());
		System.out.println(finder.equals(sameFinder));
		System.out.println(finder.equals(anotherFinder));
		System.out.println(handler.equals(sameHandler));
		System.out.println(handler.equals(anotherHandler));
	}
}
