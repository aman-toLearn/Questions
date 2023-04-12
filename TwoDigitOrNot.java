package level0;
//Two Digit Number Or Not
//Write a program to check whether the given number is two digit
//number or not
//Input Format:
//First line contains single integer n
//Output Format:
//Print Yes if it is two digit number, else No
import java.util.Scanner;

public class TwoDigitOrNot {
	
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the digit to check twodigit or not ");
	int n = 	sc.nextInt();
		
		if(n>=10 && n<= 99 || n <= -10 && n >=-99) {
			
			System.out.println("Yes");
			
		}
		else {
			System.out.println("no");
		}
	}

}
