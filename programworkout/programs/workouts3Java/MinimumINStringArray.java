package com.programs.workouts3Java;

public class MinimumINStringArray {

	public static void main(String[] args) {
String [] a= {"Logesh","Vini","Pre"};
int min=a[0].length();
String temp=null;
for(int i=0;i<a.length;i++) {
	if(a[i].length()<min) {
		min=a[i].length();
		temp=a[i];
		
	}
	
}

System.out.println(min);
System.out.println(temp);
	}

}
