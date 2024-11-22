package com.java8Program_Workout;

import java.util.List;

public class ContainsCheckProgram {

	public static void main(String[] args) {
		List<String> name = List.of("Logesh","Sanjay","Vinitha","Vino");
		printList(name);

	}

	private static void printList(List<String> names) {
		names.stream().filter(name ->name.contains("o"))
		.forEach(System.out::println);
	}

	}

