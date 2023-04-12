package level0;

import java.util.Scanner;

//Sum of combination of three numbers
//Write a program to print all sum combination of three numbers by taking
//two numbers at a time
//Input Format:
//First Line contain single integer m
//Second line contain single integer n
//Third line contain single integer k
//Output Format:
//Print all sum combination of three numbers
//Sample Input:
//2
//4
//6
//Sample Output:
//6
//8
//10
//Explanation:
//2 + 4 = 6
//2 + 6 = 8
//4 + 6 = 10

public class SumOfCombination {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int m = sc.nextInt();
		System.out.println("Enter second number:");
		int n = sc.nextInt();
		System.out.println("Enter third number:");
		int k = sc.nextInt();
		System.out.println("Output is ");
		System.out.println(m+n);
		System.out.println(m+k);
		System.out.println(n+k);
		
	}

}
