package task6;

public class IntArrayProcessor {
	
	private int[] array;
	
	public IntArrayProcessor(int[] array){
		this.array = array.clone();
	}
	
	public int getOddNumbersSummary(){
		int sum = 0;
		for( int num : array){
			if(num%2==1){
				sum += num;
			}
		}
		return sum;
	}
	
	public String toString() {
		return getClass().getName() + "[array =" + array.toString() + "]";
	}
	
	public boolean equals(Object object) {
		if(object == this) {
			return true;
		}
		if(object != null && object instanceof IntArrayProcessor) {
			IntArrayProcessor other = (IntArrayProcessor) object;
			return array.equals(other.array);
		}
		return false;
	}
	
	
}
