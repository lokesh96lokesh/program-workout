package com.programsWorkout;

public class Palindrome {

	public static void main(String[] args) {
	String name="Radar";
	String temp="";
	for (int i = name.length()-1; i>=0; i--) {
		temp=temp+name.charAt(i);
		
	}
	
	if(name.equalsIgnoreCase(temp)) {
		System.out.println("It is Palindrome");
	}
	else {
		System.out.println("It is Not Palindrome");
	}

	}

}
