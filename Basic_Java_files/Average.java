package com.programsWorkout;

public class Average {

	public static void main(String[] args) {
		  
		int count=0;
		int total=0;
		
		for(int i=1;i<=5;i++) {
			
			count++;
			total=total+i;

		}
		int average=total/count;
		System.out.println(count);
		System.out.println(average);

	}

}
