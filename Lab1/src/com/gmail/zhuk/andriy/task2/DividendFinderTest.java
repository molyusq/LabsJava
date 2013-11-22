package com.gmail.zhuk.andriy.task2;


public class DividendFinderTest {
	public static void main(String[] args) {
		DividendFinder finder = new DividendFinder(3, 9);
		GUIHandler handler = new GUIHandler(400, 300, "Lab1 Task2", finder);
		handler.initGUI();
		/*DividendFinder sameFinder = new DividendFinder(3, 9);
		DividendFinder anotherFinder = new DividendFinder(4, 5);
		UserInputHandler handler = new UserInputHandler(finder);
		UserInputHandler sameHandler = new UserInputHandler(sameFinder);
		UserInputHandler anotherHandler = new UserInputHandler(anotherFinder);
		handler.handleInput();
		sameHandler.handleInput();
		anotherHandler.handleInput();
		System.out.println(finder.toString());
		System.out.println(handler.toString());
		System.out.println(finder.equals(sameFinder));
		System.out.println(finder.equals(anotherFinder));
		System.out.println(handler.equals(sameHandler));
		System.out.println(handler.equals(anotherHandler));*/
	}
}
