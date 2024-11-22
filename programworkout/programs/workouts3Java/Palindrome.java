package com.programs.workouts3Java;

public class Palindrome {

	public static void main(String[] args) {
String a="Radar";
String temp="";
for(int i=a.length()-1;i>=0;i--) {
	temp=temp+a.charAt(i);
}
if(temp.equalsIgnoreCase(a)) {
	System.out.println("It is Palindrome");
}

else {
	System.out.println("It is Not Palindrome");
}
	

	}

}
