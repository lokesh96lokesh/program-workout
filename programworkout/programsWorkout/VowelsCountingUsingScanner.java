package com.programsWorkout;

import java.util.Scanner;

public class VowelsCountingUsingScanner {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the Name :");
		String input=scanner.nextLine().toLowerCase();
		int count=0;
		for (int i = 0; i < input.length(); i++) {
			char  ch=input.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
				
				
			}
			
		}
System.out.println(count);
scanner.close();
	}

}
