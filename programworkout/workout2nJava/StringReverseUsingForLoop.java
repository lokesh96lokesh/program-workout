package com.workout2nJava;

public class StringReverseUsingForLoop {

	public static void main(String[] args) {
String name="Logesh";
String temp="";
for(int i=name.length()-1;i>=0;i--) {
	temp=temp+name.charAt(i);
}
System.out.println(temp);
}
}
