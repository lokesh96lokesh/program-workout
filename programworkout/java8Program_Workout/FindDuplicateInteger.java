package com.java8Program_Workout;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInteger {
	
	public static void main(String[] args) {
		 List<Integer> num=List.of(1,23,4,5,67,8,59,52,23);
		 Set<Integer> temp=new HashSet<>();
		   num.stream()
		   .filter(nums ->!temp.add(nums)).forEach(System.out::println);
		
		
	}

}
