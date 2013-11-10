package com.gmail.zhuk.andriy.task1;

import java.io.*;

public class UserInputHandler {
	private PasswordChecker checker;
	
	public UserInputHandler(PasswordChecker checker) {
		this.checker = checker;
	}
	
	public void handleInput() {
		String userInput;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter your password: ");
			userInput = reader.readLine();
			if(checker.checkPassword(userInput))
				System.out.println("Welcome!");
			else System.out.println("Access denied!");
		}
		catch (Exception e) {
			System.out.println("Input Error: " + e);
		}
	}
	
	public String toString() {
		return getClass().getName() + "[checker= " + checker.toString()+"]";
	}
	
	public boolean equals(Object object) {
		if(object == this) {
			return true;
		}
		if(object != null && object instanceof UserInputHandler) {
			UserInputHandler other = (UserInputHandler) object;
			return checker.equals(other.checker);
		}
		return false;
	}
}
