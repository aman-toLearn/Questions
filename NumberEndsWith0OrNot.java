package level0;
//. Number ends with zero or not
//Write a program to Check if a given number ends with zero or not
//Input Format:
//First line contains single integer n
//Output Format:
//Print Yes if number ends with zero else No

import java.util.Scanner;

public class NumberEndsWith0OrNot {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		
		if(n%10 == 0) {
			System.out.println("yes");
		}
		else {
			
		
		System.out.println("no");
		}
	}

}
