package level0;

import java.util.Scanner;

//Convert Dollars to Rupees
//Write a program to convert Dollars to rupees
//Input Format:
//First line contains single integer representing dollar
//Output Format:
//Print result after converting dollar to rupees
public class DollarToRupee {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter dollar to be converted in rupee");
		int dollar = sc.nextInt();
		
		float rupee = dollar*81.52f;
		
		System.out.println(rupee);
		
	}

}
