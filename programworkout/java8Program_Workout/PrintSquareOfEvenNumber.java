package com.java8Program_Workout;

import java.util.List;

public class PrintSquareOfEvenNumber {
	public static void main(String[] args) {
		List<Integer> number = List.of(1,2,3,4,5,6,7,8,9);
		printEvenNumbersSquare(number);
		
	}	
		
		private static void printEvenNumbersSquare(List<Integer> numbers) {
			numbers.stream().filter(number ->number%2==0)
			.map(number ->number*number)
			.forEach(System.out::println);
		}
		

	
	
}
