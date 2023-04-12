package level0;
//Circle Area
//Write a program to find the area of the circle.
//Formula: area = pi*r*r
//Consider pi = 3.142
//Input Format:
//First line contains an Integer, radius of a circle
//Output Format:
//Give the area of the circle.
//The area of the circle should have four decimal places only.

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		float pi = 3.142f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of circle");
		
		int r = sc.nextInt();
		
		float area = pi*r*r;
		
		System.out.printf("%.4f",area);
		
		
		
	}

}
