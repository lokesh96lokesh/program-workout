package com.java8Program_Workout;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		List<Integer> number = List.of(12,13,14,15,16,17,12);
		//printAllNumbersInFunctional(number);
		printEvenNumbersInFunctional(number);

	}
	
	//public static void print(int number) {
	//	System.out.println(number);
	//}
//private static boolean isEven(int number) {
//	return number%2==0;
//}
	private static void printAllNumbersInFunctional(List<Integer> numbers) {
//
//		
//		numbers.stream().forEach(FP01Functional::print);
//		
		//		for (int number : numbers) {
//			System.out.println(number);
//		}
		numbers.stream().forEach(System.out::println);
	}
//	private static void printEvenNumbersInFunctional(List<Integer> numbers) {
//		numbers.stream().filter(FP01Functional::isEven)
//		.forEach(System.out::println);
//	}
	private static void printEvenNumbersInFunctional(List<Integer> numbers) {
		numbers.stream().filter(number ->number%2==0)
		.forEach(System.out::println);
	}
	
	}

