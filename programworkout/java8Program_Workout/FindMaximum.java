package com.java8Program_Workout;

import java.util.List;
import java.util.Optional;

public class FindMaximum {
	public static void main(String[] args) {
		
	
	 List<Integer> num=List.of(1,23,4,5,67,8,59,52);
	   Optional<Integer> max = num.stream().max(Integer::compareTo);
	   System.out.println(max.orElse(null));
	   
	}
}
