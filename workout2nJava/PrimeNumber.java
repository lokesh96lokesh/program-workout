package com.workout2nJava;

public class PrimeNumber {

	public static void main(String[] args) {
int num=96;
boolean prime =true;
for (int i = 2; i <num; i++) {
	if(num%i==0) {
	prime=false;
	
}
}
if(prime==true) {
	System.out.println("it is prime numeber");
}
else {
	System.out.println("it is not a prime number");
}
	}

}

