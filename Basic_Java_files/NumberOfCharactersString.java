package com.java8Program_Workout;

import java.util.List;

public class NumberOfCharactersString {
	public static void main(String[] args) {
		

		
		List<String> name = List.of("Logesh","Sanjay","Vinitha","Vino");
		CharacterCount(name);

	}

	private static void CharacterCount(List<String> names) {
		names.stream()
		.map(name ->name.length())
		.forEach(System.out::println);
	}

	}



