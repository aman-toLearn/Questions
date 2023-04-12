package level0;

import java.util.Scanner;

public class NumberEndsWith5orNot {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		
		if(n%10 == 5 ) {
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
		}
		

	}
	
}