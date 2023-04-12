package level0;

import java.util.Scanner;

public class TwoCondFirst {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		
		 if (n%3 == 0 && n% 5 ==0) {
			System.out.println("BTM");
		}
		
		 else if(n%3 == 0) {
			System.out.println("Tap");
		}
		else if(n%5 == 0){
			System.out.println("Academy");
			
		}
		
	}

}
