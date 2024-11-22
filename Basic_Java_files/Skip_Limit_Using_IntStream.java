package com.java82n_Workout;

import java.util.stream.IntStream;

public class Skip_Limit_Using_IntStream {

	public static void main(String[] args) {
IntStream.rangeClosed(1, 10).skip(1).limit(8).forEach(System.out::println);

	}

}
