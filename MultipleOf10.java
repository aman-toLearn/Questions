package level0;
//Multiple Of 10
//Determine whether the given number is multiple of 10 or not
//Input Format:
//First line contains single integer n
//Output Format:
//Print Yes if it is multiple of 10, else No
import java.util.Scanner;

public class MultipleOf10 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n ");
		
		int n = sc.nextInt();
		
		if(n % 10 == 0) {
			
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
		}
	}
}
