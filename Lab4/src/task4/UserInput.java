package task4;

import java.util.Scanner;

public class UserInput {

	private static UserInput instance;
	private Scanner scanner;
	private String wrongInputMessage;

	private UserInput() {
		scanner = new Scanner(System.in);
	}
	
	public static UserInput getInstance() {
		if (instance == null)
			instance = new UserInput();
		return instance;
	}

	public void printMessage(String message) {
		System.out.println(message);
	}

	public String getUserInput() {
		return scanner.next();
	}

	public void setWrongInputMessage(String msg) {
		wrongInputMessage = msg;
	}

	public int getPositiveInteger() {
		int n = 0;
		do {
			String strN = getUserInput();
			try {
				n = Integer.parseInt(strN);
			} catch (Exception e) {
				if (wrongInputMessage != null)
					printMessage(wrongInputMessage);
			}
		} while (n < 1);
		return n;
	}
}