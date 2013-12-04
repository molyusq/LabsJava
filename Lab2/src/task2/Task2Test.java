package task2;

public class Task2Test {
	public static void main(String[] args){
		DoubleArrayEvaluator array = new DoubleArrayEvaluator();
		System.out.println("array:");
		System.out.println(array.toString());
		System.out.println("sorted:");
		System.out.println(array.sortedCopy().toString());		
		System.out.println("positive sum:");
		System.out.println(String.format("%1.2f", array.getPositivesSum()));
		System.out.println("minmax mult:");
		System.out.println(String.format("%1.2f", array.getMinMaxRangeMult()));
	}
}
