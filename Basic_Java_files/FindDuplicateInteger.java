package com.java82n_Workout;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateInteger {

	public static void main(String[] args) {
List<Integer> list=List.of(1,2,3,4,5,6,1);
Set<Integer>temp=new HashSet<>();
list.stream().filter(num1 ->!temp.add(num1)).forEach(System.out::println);

}
}
