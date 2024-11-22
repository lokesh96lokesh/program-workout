package com.java8Program_Workout;

import java.util.Arrays;

public class FindLongestStringInArray {
	public static void main(String[] args) {
		
	
String[] str= {"a","bb","ccc"};
String string = Arrays.stream(str).reduce((word1,word2) -> word1.length()> word2.length()?word1:word2).get();
System.out.println(string);
}
}