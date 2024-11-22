package com.java8Program_Workout;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueElementString {
	 public static void main(String[] args) {
			String input="LogeshMoorthy";
			
			String[] result = input.split("");
			System.out.println(Arrays.toString(result));
			  List<String> collect = Arrays.stream(input.split(""))
			  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			  .entrySet().stream().filter(x ->x.getValue()==1)
			  .map(Map.Entry::getKey)
			  .collect(Collectors.toList());
			  System.out.println(collect);
			  
			  
		}
}
