package com.gmail.zhuk.andriy.task1;

public class PasswordChecker {
	private String password;
	
	public PasswordChecker() {
		this.password = "null";
	}
	
	public PasswordChecker(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	public boolean checkPassword(String userInput) {
		return this.password.equals(userInput);
	}

	public String toString() {
		return getClass().getName()+" [password=" + password + "]";	
	}

	public boolean equals(Object object) {
		if(object == this) {
			return true;
		}
		if(object != null && object instanceof PasswordChecker) {
			PasswordChecker other = (PasswordChecker) object;
			return getPassword().equals(other.getPassword());
		}
		return false;
	}
}
