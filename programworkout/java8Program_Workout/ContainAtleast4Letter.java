package com.java8Program_Workout;

import java.util.List;

public class ContainAtleast4Letter {

	public static void main(String[] args) {
	

			
				List<String> name = List.of("Logesh","Sanjay","Vinitha","Vin");
				printList(name);

			}

			public static void printList(List<String> names) {
				names.stream().filter(name ->name.length()>=4)
				.forEach(System.out::println);
			}

			}

             
                 
	


