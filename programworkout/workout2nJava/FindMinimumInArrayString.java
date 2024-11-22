package com.workout2nJava;

public class FindMinimumInArrayString {

	public static void main(String[] args) {
String[]a= {"Logesh","Vino","Preetha"};
int min=a[0].length();;
String temp=null;
for(int i=0;i<a.length;i++) {
	if(a[i].length()<=min) {
		min=a[i].length();
		temp=a[i];
		
	}
}
System.out.println(temp);

	}

}
