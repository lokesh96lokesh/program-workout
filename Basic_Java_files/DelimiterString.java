package com.workout2nJava;

import java.util.Arrays;
import java.util.List;

public class DelimiterString {

	public static void main(String[] args) {
List<String> value=Arrays.asList("Logesh","Pragathi","Sanjay");
System.out.println(value.size());
System.out.println(value);
String join=String.join(",", value);
System.out.println(join);
System.out.println(join.length());
	}

}
