package com.java8Program_Workout;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int[] numbers= {5,8,2,3,11,14};
 Integer first = Arrays.stream(numbers).boxed()
.sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
 System.out.println(first);
	}
	
	

}
