package com.java82n_Workout;

import java.util.List;

public class PrintOddNumber {

	public static void main(String[] args) {
List<Integer>list=List.of(1,2,3,4,5,6);
list.stream().filter(lis->lis%2!=0).forEach(System.out::println);
	}

}
