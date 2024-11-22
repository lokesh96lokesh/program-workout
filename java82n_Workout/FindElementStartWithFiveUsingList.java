package com.java82n_Workout;

import java.util.List;

public class FindElementStartWithFiveUsingList {

	public static void main(String[] args) {
List<Integer> list=List.of(1,2,3,5,55,65);
list.stream().filter(nums->nums.toString().startsWith("5")).forEach(System.out::println);
	}

}
