package com.java82n_Workout;

import java.util.List;

public class OddNumberCube {

	public static void main(String[] args) {
List<Integer>ls=List.of(1,2,3,4,5);
oddNumber(ls);
	}

	private static void oddNumber(List<Integer> ls) {
ls.stream().filter(num->num%2!=0).map(num->num*num*num).forEach(System.out::println);		
	}

}
