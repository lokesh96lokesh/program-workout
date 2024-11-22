package com.java82n_Workout;

import java.util.Arrays;

public class RepeatValueSpecifcOneCountingInArray {

	public static void main(String[] args) {
int[] a= {1,2,3,4,5,1};
int number=1;
long count = Arrays.stream(a).filter(num ->num==number).count();
System.out.println(count);

	}

}
