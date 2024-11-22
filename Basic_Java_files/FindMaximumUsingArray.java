package com.java82n_Workout;

import java.util.List;
import java.util.Optional;

public class FindMaximumUsingArray {

	public static void main(String[] args) {
List<Integer>list =List.of(1,2,3,4,5);
Optional<Integer>max =list.stream().max(Integer::compareTo);
System.out.println(max.orElse(null));

	}

}
