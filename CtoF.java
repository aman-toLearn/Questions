
package level0;
//Celcius to Farenheit

//Write a program to convert celsius to fahrenheit
//Formula : fahrenheit= ((celsius*9)/5)+32
//Input Format:
//First Line contain single integer m
//Output Format:
//Print the value after converting celsius to fahrenheit
//Sample Input:
//12
//Sample Output:
//53.6

import java.util.Scanner;

public class CtoF {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temerature in celsius");
		int m = sc.nextInt();
		
		float f = (m*9.0f/5) + 32 ;
		
		System.out.println("Temperature in fahrenheit is :"  + f);

	}

}
