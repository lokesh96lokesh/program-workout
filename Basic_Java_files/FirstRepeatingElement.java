package com.java8Program_Workout;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatingElement {
	 public static void main(String[] args) {
			String input="LogeshMoorthy";
			
			String[] result = input.split("");
			System.out.println(Arrays.toString(result));
			 String key = Arrays.stream(input.split(""))
			  .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
			  .entrySet().stream().filter(x ->x.getValue()>1)
			  .findFirst().get().getKey();
			  System.out.println(key);
			  
			  
		}
}
