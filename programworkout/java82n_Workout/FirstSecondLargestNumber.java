package com.java82n_Workout;

import java.util.Arrays;
import java.util.Comparator;

public class FirstSecondLargestNumber {

	public static void main(String[] args) {
int[] a= {1,2,3,4,5};
int sl=Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
System.out.println(sl);
	}

}
