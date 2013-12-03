package task2;

import java.util.Arrays;
import java.util.Random;

public class DoubleArrayEvaluator {
	private double[] array;

	public DoubleArrayEvaluator() {
		array = new double[10];
		randomize();
	}

	public DoubleArrayEvaluator(double[] array) {
		this.array = array.clone();
	}

	public void randomize() {
		Random randNumGenerator = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = -128 + randNumGenerator.nextDouble() * 256;
		}
	}

	public DoubleArrayEvaluator sortedCopy() {
		double[] copy = array.clone();
		Arrays.sort(copy);
		return new DoubleArrayEvaluator(copy);
	}

	public double getPositivesSum() {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0)
				sum += array[i];
		}
		return sum;
	}

	public double getMinMaxRangeMult() {
		int min_index = -1;
		int max_index = -1;
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			double abs_el = Math.abs(array[i]);
			if (abs_el < min) {
				min = abs_el;
				min_index = i;
			}
			if (abs_el > max) {
				max = abs_el;
				max_index = i;
			}
		}
		if (min_index > max_index) {
			int tmp = min_index;
			min_index = max_index;
			max_index = tmp;
		}
		double mult = 1;
		for (int i = min_index; i <= max_index; i++) {
			mult *= array[i];
		}
		return mult;
	}

	public String toString() {
		String sStrings = "";
		for (int i = 0; i < array.length; i++) {
			sStrings += ((i != 0) ? "," : "")
					+ String.format("%1.2f", array[i]);
		}
		return this.getClass().getName() + "[" + sStrings + "]";
	}
}
