package com.workout2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterOfString {

	public static void main(String[] args) {
	String input="LogeshMoorthy";
	
	
	String[] split = input.split("");
	System.out.println(Arrays.toString(split));
	
	Map<String, Long> collect = Arrays.stream(input.split(""))
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(collect);
	}

}
