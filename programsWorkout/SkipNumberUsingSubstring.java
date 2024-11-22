package com.programsWorkout;

public class SkipNumberUsingSubstring {

	public static void main(String[] args) {
		String name="Logesh";
		 String temp="";
		for (int i = 0; i < name.length()-1; i++) {
			temp=name.substring(1, 4);
			
		}
		System.out.println(temp);
	}

}
