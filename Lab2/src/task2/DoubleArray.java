package task2;

import java.util.Arrays;
import java.util.Random;


public class DoubleArray {
	private double[] array;
	
	public DoubleArray(){
		array = new double[10];
		randomize();		
	}
	
	public void randomize(){
		 Random randNumGenerator = new Random();
		    for (int i = 0; i < array.length; i++) {
		        array[i] = randNumGenerator.nextDouble() * 256;
		    }
	}
	
	private double[] sorted(){
		double[] copy = array.clone();
		Arrays.sort(copy);
		return copy;
	}
	
	public double getPositivesSum(){
		double sum = 0;
		for( int i=0; i<array.length; i++){
			if(array[i]>0)
				sum +=array[i];
		}
		return sum;
	}
	
	public double getMinMaxRangeSum(){
		int min_index = -1;
		int max_index = -1;
		double min = 0;
		double max = 0;
		for(int i=0;i<array.length;i++){
			double abs_el = Math.abs(array[i]);
			if(abs_el<min){
				min = abs_el;
				min_index = i;
			}
			if(abs_el>max){
				max = abs_el;
				max_index = i;
			}
		}
		if(min_index>max_index){
			int tmp = min_index;
			min_index = max_index;
			max_index = tmp;
		}
		double mult = 1;
		for(int i =min_index+1;i<max_index;i++){
			mult *= array[i];
		}
		return mult;
	}
}
