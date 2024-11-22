package com.java82n_Workout;

import java.util.List;
import java.util.Optional;

public class PlayingWithOptional {
	public static void main(String[] args) {
		List<String> fruits= List.of("Apple","Orange","Guava","banana");
		Optional<String> optional=fruits.stream().filter(fruit ->fruit.startsWith("A")).findFirst();
		System.out.println(optional.get());
		
		
		
		
	}

}
