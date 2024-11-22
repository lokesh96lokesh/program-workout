package com.java82n_Workout;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintDateAndTime {

	public static void main(String[] args) {
LocalDateTime local=LocalDateTime.now();
System.out.println(local);
DateTimeFormatter dd=DateTimeFormatter.ofPattern("dd-mm-yyyy");
System.out.println(dd.format(local));
	}

}
