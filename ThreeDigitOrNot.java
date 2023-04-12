package level0;
//Three Digit Number Or Not
//Write a program to check whether the given number is three digit
//number or not
//Input Format:
//First line contains single integer n
//Output Format:
//Print Yes if it is three digit number, else No
import java.util.Scanner;

public class ThreeDigitOrNot {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be checked ");
		
		int n = sc.nextInt();
		
		if(n <= 999 && n >= 100 || n <= -100 && n>= -999) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
