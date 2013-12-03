package task3;

public class Task3Test {

	public static void main(String[] args) {
		String text = "Это тестовая строка";
		CharToNumberStringReplacer cnsr = new CharToNumberStringReplacer(text);
		System.out.println(cnsr.getFormattedOriginString());
		System.out.println(cnsr.getFormattedReplacedString());
	}

}
