//Created By: Nicholas Brean
//Created On: Sep 2018
//Created To present the Max and Min of any generated 10 numbers

import java.util.Random;
public class MaxMin {
	public static void main(String args[]){
	
		int maxNum;
		int minNum;
		int intArray[] = new int[10];
		maxNum = 0;
		int maxValue;
		int minValue;
		
		for (int count = 0; count < 10; count++ ){
			intArray[count] = (int)(Math.random()*99);
				System.out.println(intArray[count]);
			}
		
		maxValue = Max(intArray);
		System.out.println("The Max Value is " + maxValue);
		
	
		minValue = Min(intArray);
		System.out.println("The Min Value is " + minValue);
	}
		
		
	public static int Max(int array[]){
		
		int maxVal = 0;
		
		for (int maxCount = 0; maxCount < 10; maxCount++){
			if(array[maxCount] > maxVal){
				maxVal = array[maxCount];
			}
	
	}
	return maxVal;	

	}
	
	
	public static int Min(int array[]){
		
		int minVal = 100;
		
		for (int minCount = 0; mincount < 10; minCount++){
			if(array[minCount] < minVal){
				minVal = array[minCount];
			}
	
	}
	return minVal;	

	}
}
