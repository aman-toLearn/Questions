package level0;

import java.util.Scanner;

//Even or Odd
//Check if a given number is even number or odd number
//Input Format:
//First line contains single integer n
//Output Format:
//Print Yes if it is even number, else No

public class EvenorOdd {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer:");
		int n = sc.nextInt();
		if (n%2 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}
