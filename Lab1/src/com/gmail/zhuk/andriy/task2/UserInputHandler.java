package com.gmail.zhuk.andriy.task2;

import java.io.*;
import java.util.ArrayList;

public class UserInputHandler {
	
	private DividendFinder finder;
	
	public UserInputHandler(DividendFinder finder) {
		this.finder = finder;
	}
	public void handleInput() {
		String userInput;
		ArrayList<Integer> dividendList = new ArrayList<Integer>();
		InputStreamReader inputReader = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(inputReader);
		try {
			System.out.print("Enter quantity: ");
			userInput = reader.readLine();
			System.out.println("Enter numbers: ");
			int size = Integer.parseInt(userInput);
			for(int i=0; i < size; i++) {
				userInput = reader.readLine();
				finder.add(Integer.parseInt(userInput));
			}
			dividendList = finder.findDividends();
			System.out.print("Dividents: ");
			System.out.println(dividendList.toString());
		} catch (Exception e) {
			System.out.println("Input Error: " + e.getMessage());
		}
	}
	
	public String toString() {
		return getClass().getName() + "[finder=" + finder.toString() + "]";
	}
	
	public boolean equals(Object object) {
		if(object == this) {
			return true;
		}
		if(object != null && object instanceof UserInputHandler) {
			UserInputHandler other = (UserInputHandler) object;
			return finder.equals(other.finder);
		}
		return false;
	}
}
