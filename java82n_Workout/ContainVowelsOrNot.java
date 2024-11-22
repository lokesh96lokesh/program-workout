package com.java82n_Workout;

import java.util.List;

public class ContainVowelsOrNot {

	public static void main(String[] args) {
List<String>name=List.of("Logesh","Sanjay","Vino");
printname(name);

	}

	private static void printname(List<String> name) {
name.stream().filter(name1 ->name1.contains("o")).forEach(System.out::println);		
	}

}
