package com.java8Program_Workout;

import java.util.List;

public class PrintOddNumbers {
	public static void main(String[] args) {
		List<Integer> number = List.of(12,13,14,15,16,17,12,9);
		printOdd(number);

	}

	private static void printOdd(List<Integer> numbers) {
		numbers.stream().filter(number ->number%2!=0)
		.forEach(System.out::println);
	}
	
		
	}

