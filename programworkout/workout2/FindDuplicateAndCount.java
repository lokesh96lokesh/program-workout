package com.workout2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateAndCount {

	public static void main(String[] args) {
List<String> lis=List.of("Apple","Orange","Guava","Grapes","Lemon","Apple","Guava");
Map<String,Long> map=lis.stream().collect(Collectors.groupingBy(s ->s,Collectors.counting()));

map.entrySet().stream().filter(m ->m.getValue()>1).forEach(m -> System.out.println(m.getKey()+":"+m.getValue()));



	}

}
