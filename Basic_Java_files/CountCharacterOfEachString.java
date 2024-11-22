package com.java8Program_Workout;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterOfEachString {

	public static void main(String[] args) {
		//List<String> list= Arrays.asList("Apple","Mango","Guvava","Lemon");
 String input="ilovejavatechie";
 //String[] result=input.split("");
 //System.out.println(Arrays.toString(result));
 
 //Map<String, List<String>> map = Arrays.stream(input.split("")).collect(Collectors.groupingBy(s ->s));
 Map<String, Long> map = Arrays.stream(input.split(""))
		 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
 System.out.println(map);
 
 
	}

}
