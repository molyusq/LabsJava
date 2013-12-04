package task5;

import java.util.ArrayList;
import java.util.Collections;

public class Task5Test {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		Collections.addAll(array, 1, 5, 8, -4, 2, 1);
		System.out.println("unsorted: ");
		for (Integer i : array) {
			System.out.print(" " + i);
		}
		Collections.sort(array);
		System.out.println("\r\nsorted: ");
		for (Integer i : array) {
			System.out.print(" " + i);
		}
	}
}
