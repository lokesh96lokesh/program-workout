package com.java8Program_Workout;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {

	public static void main(String[] args) {
//List<String> fruits=List.of("Apple","Orange","Guava","Grapes");
		List<String> fruits=Arrays.asList("Apple","Orange","Guava","Grapes");
		Predicate<? super String> predicate= fruit ->fruit.startsWith("A");
		Optional<String> optional = fruits.stream().filter(predicate).findFirst();
		System.out.println(optional);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());


		
		

	}

}
