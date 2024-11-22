package com.java82n_Workout;

import java.util.List;
import java.util.Optional;

public class FindMinimumUsingArray {

	public static void main(String[] args) {
List<Integer>min=List.of(1,2,3,4,5);
Optional<Integer>min2=min.stream().min(Integer::compareTo);
System.out.println(min2.orElse(null));
	}

}
