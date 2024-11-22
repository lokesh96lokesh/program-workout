package com.java82n_Workout;

import java.util.List;

public class ListOfStringToUpperCase {

	public static void main(String[] args) {
List<String>list=List.of("Logesh","Vinitha","Pragathi");

list.stream().map(s ->s.toUpperCase()).forEach(System.out::println);
	}

}
