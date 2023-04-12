package classquestions;

import java.util.Scanner;

public class PrimeOptimal {
	
	static boolean isPrime(int N) {
		//int count = 0;
		for(int i = 2; i <= N/2; i++) {
			if(N%i == 0) {
				return false;
				//means is  not prime 
			}
			
		}
		
		return true;
	
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N ");
		
		int N = scan.nextInt();
		
if(PrimeOptimal.isPrime(N)) {
	System.out.println(N+ " is prime");
}
else {
	System.out.println(N+ " is  not prime");
}
}}

