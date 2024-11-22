package com.java8Program_Workout;

import java.util.List;

public class PrintSquareOfTheNumberGreaterFifty {
	public static void main(String[] args) {
		
	
List<Integer> num=List.of(1,2,20,30,40);

num.stream().map(nums ->nums*nums)
.filter(nums ->nums>50).forEach(System.out::println);
}
}
