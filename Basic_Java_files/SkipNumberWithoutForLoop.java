package com.workout2nJava;

public class SkipNumberWithoutForLoop {
public static void main(String[] args) {
	String name="Logesh";
	String temp="";
	for(int i=0;i<=name.length()-1;i=i+2) {
		System.out.println(name.charAt(i));
		temp=temp+name.charAt(i);
	}
	System.out.println(temp);
}

}
