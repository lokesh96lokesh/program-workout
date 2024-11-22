package com.java8Program_Workout;

import java.util.Arrays;

public class SortArrayConvertIntoStrean {

	public static void main(String[] args) {
int[] a= {5,4,3,2,1};
System.out.println(a);
Arrays.sort(a);
System.out.println(Arrays.toString(a));
Arrays.stream(a).forEach(System.out::println);
	}

}
