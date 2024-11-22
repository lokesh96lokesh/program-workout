package com.programsWorkout;

public class FindMinimumInArray {

	public static void main(String[] args) {
		int[] bulk= {1,2,3,4,5,6,7,8,9,10};
		int min=bulk[0];
for(int i=0;i<bulk.length;i++) {
	if(bulk[i]<=min) {
		min=bulk[i];
	}
	
}
System.out.println(min);


	}

}
