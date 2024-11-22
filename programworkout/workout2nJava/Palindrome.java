package com.workout2nJava;

public class Palindrome {

	public static void main(String[] args) {
String a="Radar";
String temp="";
for (int i =a.length()-1;i>=0; i--) {
	temp=temp+a.charAt(i);	
}
if(a.equalsIgnoreCase(temp)) {
	System.out.println("Palindrome");
}
else {
	System.out.println("it is not palindrome");
}
	}

}
