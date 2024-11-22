package com.programs.workouts3Java;

public class FindMaximumInStringArray {

	public static void main(String[] args) {
String[] a= {"vini","Logesh","pre"};
int max=a[0].length();
String n=null;

for(int i=0;i<=a.length-1;i++) {
	if(a[i].length()>max) {
		max=a[i].length();
		n=a[i];
	}
}
System.out.println(n);
System.out.println(max);
	}

}
