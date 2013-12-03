package task4;

public class Task4Test {

	public static void main(String[] args) {
		WordsCounterMap wcm = new WordsCounterMap();
		String text = "one kitty, soft kitty, little kitty one juno";
		wcm.countWordsInString(text);
		System.out.println(text);
		System.out.println(wcm.toString());
	}

}
