package com.java8Program_Workout;

import java.util.stream.Stream;

public class ConcatTwoStream {

	public static void main(String[] args) {
Stream<Integer> s1=Stream.of(1,2,3,4);
Stream<Integer> s2=Stream.of(5,6,7,8);

Stream.concat(s1, s2).forEach(System.out::println);


	}

}
