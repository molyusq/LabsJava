package task3;

public class CharIterator implements Iterator {

	private char[] chars;
	int currentPos = -1;
	
	public CharIterator(String str){
		chars = new char[str.length()];
		str.getChars(0, str.length(), chars, 0);
	}
	
	@Override
	public boolean hasNext() {
		return (currentPos+1<chars.length);	
	}

	@Override
	public Object next() {
		currentPos++;
		Object current = chars[currentPos];		
		return current;
	}

}
