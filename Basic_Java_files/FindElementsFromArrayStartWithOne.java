package com.java8Program_Workout;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementsFromArrayStartWithOne {

	public static void main(String[] args) {
		int[] numbers= {5,8,2,3,11,14};
		List<String> collect = Arrays.stream(numbers).boxed()
		.map(s ->s+"").filter(s ->s.startsWith("1"))
		.collect(Collectors.toList());
		System.out.println(collect);
}
	
}
