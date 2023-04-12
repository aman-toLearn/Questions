package level0;
//Multiple Of 5 and 3
//Write a program to check whether the number is multiple of both 5
//and 3.
//Input Format:
//First line contains single integer n
//Output Format:
//Print Yes if it is multiple of 5 and 3, else No
import java.util.Scanner;

public class MultipleOf3a5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n ");
		int n = sc.nextInt();
		
		if(n%3==0 && n%5==0) {
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
		}
	}

}
