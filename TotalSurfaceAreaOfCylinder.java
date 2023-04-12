package level0;

import java.util.Scanner;

//Total Surface Area Of Cylinder
//Write a program to calculate total surface area of a cylinder
//Formula: 2 * pi* r*(r+h)
//Input Format:
//First line contains an Integer, radius of a cylinder
//Second line contains an Integer, height of a cylinder
//Output Format:
//Give the area of the cylinder.
//The area of the cylinder should have four decimal places only.


public class TotalSurfaceAreaOfCylinder {
	
	public static void main(String[] args) {
		float pi = 3.142f;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter radius of a cylinder");
		int r = scan.nextInt();
		System.out.println("Enter height  of a cylinder");
		int h = scan.nextInt();
		
		float area = 2 * pi* r*(r+h);
		
		System.out.printf("%.4f",area);
		
		
	}

}
