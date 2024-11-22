package com.programs.workouts3Java;

public class Average {

	public static void main(String[] args) {
int count =0;
int total=0;

for(int i=1;i<=5;i++) {
	count++;
	total=total+i;
}
System.out.println("Total Count is"+" "+count);
System.out.println(total);
System.out.println(total/count);
	}


}
