package com.programsWorkout;

public class SkipWithoutForLoop {

	public static void main(String[] args) {
		String name="Logesh";
		for (int i = 0; i < name.length()-1; i+=2) {
			System.out.println(name.charAt(i));
		}

	}

}
