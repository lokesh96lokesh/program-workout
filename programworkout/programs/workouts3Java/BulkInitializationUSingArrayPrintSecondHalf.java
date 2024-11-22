package com.programs.workouts3Java;

public class BulkInitializationUSingArrayPrintSecondHalf {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		for(int i=a.length/2+1;i<=a.length;i++) {
			System.out.println(i);
		}

	}

}
