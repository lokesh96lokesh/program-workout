package com.java82n_Workout;

import java.util.List;

public class ContainAtleast4Letter {

	public static void main(String[] args) {
List<String>name=List.of("Logesh","Sanjay","Vin");
printnames(name);


	}

	private static void printnames(List<String> names) {
names.stream().filter(name1->name1.length()>4).forEach(System.out::println);	
	}

}
