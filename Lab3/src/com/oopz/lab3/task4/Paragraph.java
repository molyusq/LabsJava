package com.oopz.lab3.task4;

public class Paragraph implements TextElement {
	
	private String[] strings;
	
	public Paragraph() {
		strings = null;
	}
	
	public Paragraph(String[] strings) {
		this.strings = strings;
	}
	
	public String[] getStrings() {
		return strings;
	}

	@Override
	public void accept(TextElementVisitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (obj == null || (obj.getClass() != this.getClass())) return false;
		
		Paragraph paragraph = (Paragraph) obj;
		
		if (paragraph.strings == this.strings) return true;
		if (paragraph.strings.length != this.strings.length) return false;
		
		for (int i = 0; i < strings.length; i++) 
			if (!paragraph.strings[i].equals(strings[i])) return false;
		
		return true;

	}
	
	@Override
	public java.lang.String toString() {
		return null;
	}
}
