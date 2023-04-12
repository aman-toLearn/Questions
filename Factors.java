package classquestions;

import java.util.Scanner;

public class Factors {
	
	
	static int isPrime(int N) {
		
		int count = 0;
		for(int i = 1; i <= N; i++) {
			if(N%i == 0) {
				count++;
				//System.out.println(i+" is a facor of "+N);
			}
			
		}
		//System.out.println(count);

//		if(count == 2) {
//			//System.out.println(N+ " is prime");
//			return true;
//		}
//		else {
//			//System.out.println(N+" is not prime");
//			return false;
//		
//	}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Enter N");
		int N = scan.nextInt();
		if(Factors.isPrime(N) == 2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		
	}
	
	}


