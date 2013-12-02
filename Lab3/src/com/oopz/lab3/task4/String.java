package com.oopz.lab3.task4;

import java.util.Arrays;

public class String implements TextElement {
	
	private char[] chars;
	
	public String() {
		chars = null;
	}
	
	public String(java.lang.String string) {
		chars = string.toCharArray();
	}
	
	public String(char[] chars) {
		chars = Arrays.copyOf(chars, chars.length);
	}
	
	public char[] getChars() {
		return chars;
	}

	@Override
	public void accept(TextElementVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == this) return true;
		if (obj == null || (obj.getClass() != this.getClass())) return false;
		
		String string = (String) obj;
		
		if (string.chars == this.chars) return true;
		if (string.chars.length != this.chars.length) return false;
		
		for (int i = 0; i < chars.length; i++) 
			if (string.chars[i] != chars[i]) return false;
		
		return true;
	}
	
	@Override
	public java.lang.String toString() {
		return new java.lang.String(chars);
	}
}
