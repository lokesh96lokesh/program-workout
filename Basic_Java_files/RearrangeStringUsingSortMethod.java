package com.programsWorkout;

import java.util.Arrays;

public class RearrangeStringUsingSortMethod {

	public static String RearrangeString(String input) {
		
		char[] charArray=input.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		 String input="abchfj";
		 System.out.println("original data :"+input);
		 String output= RearrangeString(input);
		 System.out.println(output);

	}

}
