package com.workout2nJava;

public class SkipNumberArray {

	public static void main(String[] args) {
int[]a= {1,2,3,4,5};
for(int i=1;i<=a.length;i++) {
	if(i==5||i==4) {
		continue;
	}
	System.out.println(i);
	
}
	}

}
