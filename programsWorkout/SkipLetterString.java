	package com.programsWorkout;

public class SkipLetterString {

	public static void main(String[] args) {
		String name="Logesh";
		String temp="";
		for (int i = 0; i < name.length()-1; i++) {
			if(name.charAt(i)=='L'||name.charAt(i)=='h') {
			continue;
			
		}
		System.out.println(name.charAt(i));

	}

}
}
