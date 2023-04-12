package level0;
//Perimeter Of a Square

import java.util.Scanner;

//write a program to find the perimeter of the square
//Formula: Perimeter = 4 * side
//Input Format:
//First line contains an Integer, side of a square
//Output Format:
//Gives perimeter of the square

public class PerimeterOfSquare {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side of the square :");
		int side = sc.nextInt();
		
		int Perimeter = 4 * side;
		
		System.out.println("perimeter of the square is :" + Perimeter);
		

	}

}
