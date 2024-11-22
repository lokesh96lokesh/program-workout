package com.java8Program_Workout;

import java.util.List;

public class FindFirstElementofList {
   public static void main(String[] args) {
	
	   List<Integer> num=List.of(1,23,4,5,67,8);
	   num.stream().findFirst().ifPresent((System.out::println));
	   
}
}
