package com.java82n_Workout;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class DescendingOrder {

	public static void main(String[] args) {
List<Integer> list=List.of(1,2,3,4,5,6,7);
list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
