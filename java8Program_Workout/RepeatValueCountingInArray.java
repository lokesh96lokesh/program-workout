package com.java8Program_Workout;

import java.util.Arrays;

public class RepeatValueCountingInArray {

	public static void main(String[] args) {
int[] num= {1,2,3,4,5,1,2,3};

int number=1;

long count = Arrays.stream(num).filter(nums ->nums==number).count();
System.out.println(count);
	}

}
