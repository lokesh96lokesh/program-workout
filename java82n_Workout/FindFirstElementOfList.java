package com.java82n_Workout;

import java.util.List;

public class FindFirstElementOfList {

	public static void main(String[] args) {
List<Integer> list=List.of(2,2,3,4,5);
list.stream().findFirst().ifPresent(System.out::println);
	}

}
