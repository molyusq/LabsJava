package task6;

public class Task6Test {
	public static void main(String[] args){
		int[] numbers = new int[]{1,-5,8,-9,15,35,46,8};
		IntArrayProcessor ap = new IntArrayProcessor(numbers);
		System.out.println(ap.getOddNumbersSummary());		
	}
}
