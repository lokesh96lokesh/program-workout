package com.java82n_Workout;

import java.util.Arrays;

public class ConttainDuplicateValueOrNot {

	public static void main(String[] args) {
int[] a= {1,2,3,4,5,};
if(Arrays.stream(a).distinct().count()!=a.length) {
	System.out.println("It contain Duplicate");
	
}
else {
	System.out.println("It does not contain any duplicate");
}
	}

}
