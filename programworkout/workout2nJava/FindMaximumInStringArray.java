package com.workout2nJava;

public class FindMaximumInStringArray {

	public static void main(String[] args) {
String[] a= {"Logesh","Sanajy","Vinitha"};
int max=0;
String temp=null;
for(int i=0;i<a.length;i++) {
	if(a[i].length()>max) {
		max=a[i].length();
		temp=a[i];
	}
}
System.out.println(temp);
	}

}
