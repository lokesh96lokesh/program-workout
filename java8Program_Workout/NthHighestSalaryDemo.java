package com.java8Program_Workout;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class NthHighestSalaryDemo {
	
	public static void main(String[] args) {
		
		Map<String,Integer> map1=new HashMap<>();
		Map<String,Integer> map2=new HashMap<>();
		
		map1.put("Logesh", 1000);
		map1.put("Sanjay", 100);
		map1.put("Vinitha", 200);
		map1.put("Gokul", 300);
		map1.put("Vino", 400);
		map1.put("Preetha", 500);
		map1.put("Pragathi", 600);
		
		map2.put("Logesh", 1000);
		map2.put("Sanjay", 100);
		map2.put("Vinitha", 400);
		map2.put("Gokul", 300);
		map2.put("Vino", 400);
		map2.put("Preetha", 600);
		map2.put("Pragathi", 600);
		
//		 Entry<Integer, List<String>> entry = map2.entrySet().stream()
//				.collect(Collectors.groupingBy(Map.Entry::getValue,Collectors
//						.mapping(Map.Entry::getKey,Collectors.toList())))
//				.entrySet().stream().sorted(Collections
//						.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList())
//				.get(2);
//		 System.out.println(entry);
//		 o/p:400=[Vinitha, Vino] 4&5 are same now we convert to method
		 
		 
		// System.out.println(getRandomtSalary(2,map2));
		
		
//		
//		Entry<String, Integer> result = getNthHighestSalary(2,map2);
//		System.out.println(result);
//	1	Entry<String, Integer> entry = map1.entrySet().stream().sorted(Map.Entry.comparingByValue())
//		.collect(Collectors.toList()).get(1);
//		System.out.println(entry);//if we give like this its sorted in ascending order vinitha details was show
		
//	2	 Entry<String, Integer> entry = map1.entrySet().stream()
//				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))//now we reverse the 
//				//order and pragathi details was shown
//				.collect(Collectors.toList()).get(1);
//				System.out.println(entry); //now we modify to method in 3 step
	} 
//3	
//	public static Entry<String, Integer> getNthHighestSalary(int num,Map<String, Integer> map){
//		return map.entrySet().stream()
//		.sorted(Collections.reverseOrder(Map.Entry.comparingByValue())) 
//.collect(Collectors.toList()).get(num-1); //in this case we only have one name but in the same salary having more number
//	//of people so go for step4 Preetha=600
//}
	//5
//	public static Entry<Integer, List<String>>  getRandomtSalary(int num,Map<String, Integer> map){
//		return map.entrySet().stream()
//				.collect(Collectors.groupingBy(Map.Entry::getValue,Collectors
//						.mapping(Map.Entry::getKey,Collectors.toList())))
//				.entrySet().stream().sorted(Collections
//						.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList())
//				.get(num-1);
//		
//	}
	}
	

