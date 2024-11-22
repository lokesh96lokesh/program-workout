package com.programs.workouts3Java;

import java.util.Arrays;
import java.util.List;

public class DelimiterString {

	public static void main(String[] args) {
List<String> s= Arrays.asList("Logesh","Vini","Sanjay");
System.out.println(s.size());
System.out.println(s);
String join=String.join(",",s);
System.out.println(join);
System.out.println(join.length());


	}

}
