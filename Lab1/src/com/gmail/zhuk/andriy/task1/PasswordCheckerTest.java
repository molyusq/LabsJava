package com.gmail.zhuk.andriy.task1;

public class PasswordCheckerTest {
	
	public static void main(String[] args) {
		PasswordChecker checker = new PasswordChecker("hesoyam");
		/*PasswordChecker anotherChecker = new PasswordChecker();
		PasswordChecker sameChecker = new PasswordChecker("hesoyam");
		System.out.println(checker.equals(sameChecker));
		System.out.println(checker.equals(anotherChecker));
		System.out.println(checker.toString());
		UserInputHandler handler = new UserInputHandler(checker);
		UserInputHandler sameHandler = new UserInputHandler(checker);
		UserInputHandler anotherHandler = new UserInputHandler(anotherChecker);
		System.out.println(handler.equals(sameHandler));
		System.out.println(handler.equals(anotherHandler));
		System.out.println(handler.toString());
		handler.handleInput();*/
		GUIHandler handler = new GUIHandler(400, 300, "Lab1 Task1", checker);
		handler.initGUI();
	}
}
