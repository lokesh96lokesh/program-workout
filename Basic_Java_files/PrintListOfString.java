package com.java82n_Workout;

import java.util.List;

public class PrintListOfString {

	public static void main(String[] args) {
List<String>list=List.of("logesh","Vinitha","Pragathi");
list.stream().forEach(System.out::println);

	}

}
