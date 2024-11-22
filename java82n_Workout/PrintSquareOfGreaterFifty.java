package com.java82n_Workout;

import java.util.List;

public class PrintSquareOfGreaterFifty {

	public static void main(String[] args) {
List<Integer>ls=List.of(1,2,3,4,5,40);
ls.stream().map(s ->s*s).filter(s ->s>50).forEach(System.out::println);
	}

}
