package com.java8Program_Workout;

import java.util.List;

public class ListOfStringToUpperCase {

	public static void main(String[] args) {
     List<String> name=List.of("Logesh","Sanjay","Vinitha");
     name.stream().map(nam ->nam.toUpperCase()).forEach(System.out::println);
     
     
	}

}
