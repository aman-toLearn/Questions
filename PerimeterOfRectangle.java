package level0;

import java.util.Scanner;

//Perimeter Of a Rectangle
//write a program to find the perimeter of the rectangle
//Formula: area = length *width
//Input Format:
//First line contains an Integer, length of a rectangle
//Second line contains an Integer, represents width of a rectangle
//Output Format:
//Gives perimeter of the rectangle
public class PerimeterOfRectangle {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length of Rectangle");
		int length = scan.nextInt();
		
		System.out.println("Enter width of Rectangle");
		int width = scan.nextInt();
		
		int area = 2*(length + width);
		
		System.out.println("Area of rectangle is :" + area);
		
	}

}
