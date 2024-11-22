package com.java8Program_Workout;

import java.util.List;

public class PrintListOfString {

	public static void main(String[] args) {
		List<String> name = List.of("Logesh","Sanjay","Vinitha","Vino");
		printList(name);

	}

	private static void printList(List<String> names) {
		names.stream()
		.forEach(System.out::println);
	}

	}


