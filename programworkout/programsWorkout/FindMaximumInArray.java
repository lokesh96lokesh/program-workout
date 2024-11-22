package com.programsWorkout;

public class FindMaximumInArray {

	public static void main(String[] args) {
		int[] bulk= {1,2,3,4,5,6,7,8,9,10};
		int max=bulk[0];
for(int i=0;i<bulk.length;i++) {
	if(bulk[i]>=max) {
		max=bulk[i];
	}
	
}
System.out.println(max);

	}

}
