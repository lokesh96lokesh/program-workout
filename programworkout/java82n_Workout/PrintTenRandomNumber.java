package com.java82n_Workout;

import java.util.Random;
import java.util.stream.Stream;

public class PrintTenRandomNumber {

	public static void main(String[] args) {
Random r=new Random();
Stream.generate(r::nextInt).limit(10).forEach(System.out::println);
	}

}
