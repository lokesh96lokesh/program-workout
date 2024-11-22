package com.java82n_Workout;

import java.util.List;

public class NumberOfCharacterString {

	public static void main(String[] args) {
List<String>list=List.of("Logesh","Pragathi","Vinitha");
characterCount(list);
	}

	private static void characterCount(List<String> list) {
list.stream().map(s->s.length()).forEach(System.out::println);		

	}

}
