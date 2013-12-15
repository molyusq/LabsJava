package task4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordsCounterMap {

	private HashMap words = new HashMap();

	public WordsCounterMap() {

	}

	public void clearResults() {
		words.clear();
	}

	public void incWord(String word) throws Exception {
		if (!words.containsKey(word)) {
			words.put(word, 1);
		} else {
			words.put(word, getWordCount(word) + 1);
		}
	}

	public int getWordCount(String word) throws Exception {
		if (!words.containsKey(word)) {
			throw new Exception("no such word in counter: " + word);
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
		Iterator it = words.keySet().iterator();
		while (it.hasNext()) {
			String word = (String) it.next();
			sWords += "\"" + word + "\":" + words.get(word) + ",";
		}
		return this.getClass().getName() + "[words={" + sWords + "}]";
	}
}
