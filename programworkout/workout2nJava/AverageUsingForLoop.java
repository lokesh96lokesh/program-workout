package com.workout2nJava;

public class AverageUsingForLoop {

	public static void main(String[] args) {
	int count=0;
	int total=0;
	for(int i=1;i<=5;i++) {
		count++;
		total=total+i;
	}
	
int average=total/5;
System.out.println(average);
System.out.println(count);

	}

}
