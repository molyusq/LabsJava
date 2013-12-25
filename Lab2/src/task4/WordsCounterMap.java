package task4;

import java.util.HashMap;
import java.util.Iterator;

public class WordsCounterMap {

	private HashMap<String, Integer> words = new HashMap<String, Integer>();

	public void clearResults() {
		words.clear();
	}

	public void incWord(String word) {
		if (!words.containsKey(word)) {
			words.put(word, 1);
		} else {
			words.put(word, getWordCount(word) + 1);
		}
	}

	public int getWordCount(String word){
		if (!words.containsKey(word)) {
			throw new RuntimeException("no such word in counter: " + word);
		} else {
			return (Integer) words.get(word);
		}
	}

	public void countWordsInString(String str) {
		String[] split = str.split(" ");
		for (String word : split) {
			String word2 = word.replace(",", "");
			try {
				incWord(word2);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {
		String sWords = "";
		Iterator<String> it = words.keySet().iterator();
		while (it.hasNext()) {
			String word = (String) it.next();
			sWords += "\"" + word + "\":" + words.get(word) + ",";
		}
		return this.getClass().getName() + "[words={" + sWords + "}]";
	}
}
