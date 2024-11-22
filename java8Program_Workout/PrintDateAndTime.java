package com.java8Program_Workout;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintDateAndTime {

	public static void main(String[] args) {
LocalDateTime localdate= LocalDateTime.now();
System.out.println(localdate);
DateTimeFormatter dd=DateTimeFormatter.ofPattern("dd-MM-YYYY");
System.out.println(dd.format(localdate));

	}

	
	
}
