package com.java82n_Workout;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindElementsStartWithOneInArray {

	public static void main(String[] args) {
int[] a= {1,2,3,4,11,5};
List<String>list=Arrays.stream(a).boxed().map(s->s+"").
filter(s->s.startsWith("1")).collect(Collectors.toList());
System.out.println(list);
	}

}
