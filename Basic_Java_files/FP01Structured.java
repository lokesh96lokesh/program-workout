package com.java8Program_Workout;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12,13,14,15,16,17,12);
		//printAllNumbersInStructured(numbers);
		printEvenNumbersInStructured(numbers);
	}

	private static void printAllNumbersInStructured(List<Integer> numbers) {
		for (int number : numbers) {
			System.out.println(number);
		}
		
	}
	private static void printEvenNumbersInStructured(List<Integer> numbers) {
		for (int number : numbers) {
			if(number%2==0) {
			System.out.println(number);
		}
		
	}
}
}
