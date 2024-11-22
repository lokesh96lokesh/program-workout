package com.workout2nJava;

public class SkipLetterString {

	public static void main(String[] args) {
String a="Logesh";
String temp="";
for(int i=0;i<=a.length()-1;i++) {
	if(a.charAt(i)=='L'||a.charAt(i)=='h') {
		continue;
		
	}
	System.out.println(a.charAt(i));
}



	}

}
