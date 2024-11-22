package com.programsWorkout;

import java.util.Arrays;
import java.util.List;

public class DelimiterString {
	
	public static void main(String[] args) {
		List<String> items=Arrays.asList("item1","item2","item3");
		System.out.println(items);
		System.out.println(items.size());
		String result=String.join(",",items);
		System.out.println(result);
		System.out.println(result.length());
	}

}
