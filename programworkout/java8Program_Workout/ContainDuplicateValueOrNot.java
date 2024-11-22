package com.java8Program_Workout;

import java.util.Arrays;

public class ContainDuplicateValueOrNot {

	public static void main(String[] args) {
int[] num= {1,2,3,4,5,1};
if(Arrays.stream(num).distinct().count()!=num.length) {
	System.out.println("Array Contain Duplicate");
}else {
	System.out.println("Array not Contain Duplicate");

}
	
	}

}
