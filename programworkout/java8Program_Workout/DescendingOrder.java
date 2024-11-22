package com.java8Program_Workout;

import java.util.Comparator;
import java.util.List;

public class DescendingOrder {
	public static void main(String[] args) {
List<Integer> num=List.of(8,7,6,5,4,3,2,1);
num.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
