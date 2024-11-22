package com.workout2nJava;

public class FindMaximumInArray {

	public static void main(String[] args) {
int[] value= {1,2,3,4,5,6,7,8,9,10};
int max=value[0];
for(int i=0;i<value.length;i++) {
	if(value[i]>=max) {
		max=value[i];
	}
}
System.out.println(max);
	}

}
