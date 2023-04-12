package level0;
//. Three Digit Number and a multiple of 10
//Check if a given number is three digit number and also it is a
//multiple for 10
//Input Format:
//First line contains single integer n
//Output Format:
//Print Yes if it is three digit number and multiple of 10, else No
import java.util.Scanner;

public class ThreeDigitNumAndMof10 {
	
	public static void main(String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number n ");
		
		int n = sc.nextInt();
		
		if((n <= 999 && n >= 100 || n <=-100 && n>=-999)
				&&n%10==0)
		{
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
