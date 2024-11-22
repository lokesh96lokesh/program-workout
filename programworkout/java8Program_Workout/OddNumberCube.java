package com.java8Program_Workout;

import java.util.List;

public class OddNumberCube {
	public static void main(String[] args) {
		List<Integer> number = List.of(1,2,3,4,5,6,7,8,9);
		printOddNumberCube(number);
		
	}	
		
		private static void printOddNumberCube(List<Integer> numbers) {
			numbers.stream().filter(number ->number%2!=0)
			.map(number ->number*number*number)
			.forEach(System.out::println);
		}
		

	
}
