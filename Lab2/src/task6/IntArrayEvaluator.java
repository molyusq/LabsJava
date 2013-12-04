package task6;

public class IntArrayEvaluator {

	private int[] array;

	public IntArrayEvaluator(int[] array) {
		this.array = array.clone();
	}

	public int getOddNumbersSummary() {
		int sum = 0;
		for (int num : array) {
			if (num % 2 == 1) {
				sum += num;
			}
		}
		return sum;
	}

	public String toString() {
		return getClass().getName() + "[array =" + array.toString() + "]";
	}

	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object != null && object instanceof IntArrayEvaluator) {
			IntArrayEvaluator other = (IntArrayEvaluator) object;
			return array.equals(other.array);
		}
		return false;
	}

}
