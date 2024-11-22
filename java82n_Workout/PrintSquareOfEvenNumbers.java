package com.java82n_Workout;

import java.util.List;

public class PrintSquareOfEvenNumbers {

	public static void main(String[] args) {
List<Integer>lis=List.of(1,2,3,4,5,6);
lis.stream().filter(s->s%2==0).map(s->s*s).forEach(System.out::println);
	}

}
