package com.java8Program_Workout;

import java.util.List;

public class FindElementStartsWithNumberFive {
	 public static void main(String[] args) {
			
		   List<Integer> num=List.of(1,23,4,5,67,8,59,52);
		   num.stream().filter(nums ->nums.toString()
				   .startsWith("5")).forEach(System.out::println);
		   
	}
}
