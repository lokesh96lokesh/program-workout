package com.programsWorkout;

public class FindMaxingLengthUsingString {

	public static void main(String[] args) {
String[] a= {"Logesh","Robin","Sakthivel"};
int max=0;
String temp=null;
for (int i = 0; i < a.length; i++) {
	if (a[i].length()>max) {
		max=a[i].length();
	temp=a[i];
	}
	
}

System.out.println(temp);

	}

}
