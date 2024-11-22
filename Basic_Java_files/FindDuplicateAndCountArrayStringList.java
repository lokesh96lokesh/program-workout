package com.java8Program_Workout;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateAndCountArrayStringList {

	public static void main(String[] args) {
List<String> s= List.of("Apple","Orange","Guava","Grapes","Lemon","Apple","Guava");
Map<String,Long> map=s.stream().collect(Collectors.groupingBy(s1 ->s1,Collectors.counting()));
map.entrySet().stream().filter(m ->m.getValue()>1).forEach(m ->System.out.println(m.getKey()+" :" +m.getValue()));
	}

}
