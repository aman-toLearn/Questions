package level0;
//Farenheit to Celcius
//Write a program to convert celsius to fahrenheit
//Formula : Celsius = ((Fahrenheit-32)*5)/9;
//Input Format:
//First Line contain single integer m
//Output Format:
//Print the value after converting fahrenheit to celsius, the result should
//restrict to 4 decimal places

import java.util.Scanner;

public class FtoC {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temerature in Farenheit");
		int m = sc.nextInt();
		
		float c = ((m-32)*5)/9;
		
		System.out.printf("%.4f",c);
		
	}

}
