package com.java8Program_Workout;

import java.util.Random;
import java.util.stream.Stream;

public class PrintTenRandomNumber {

	public static void main(String[] args) {
Random random =new Random();
Stream.generate(random::nextInt).limit(10).forEach(System.out::println);
	}

}
