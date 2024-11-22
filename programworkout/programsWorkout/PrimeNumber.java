package com.programsWorkout;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=97;
		boolean prime=true;
		for (int i = 2; i < num; i++) {
			if(num%i==0) {
				 prime=false;
				 //important note in for loop section dont use = if you will use it display not prime because prime condition 
				 //is not divisible by 1 and other while giving it divisible by own so equal to not use in the for loop and initiziation start by 2 not 1  
				
			}
		}
			 if(prime==true) {
				System.out.println("Given number is  prime");
		}
		
			 else {
					System.out.println("Given number is not prime");

	}


}
}
