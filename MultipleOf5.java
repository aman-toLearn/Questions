package level0;
//Multiple Of 5
//Determine whether the given number is multiple of 5 or not
//Input Format:
//First line contains single integer n
//Output Format:
//Print Yes if it is multiple of 5, else No
import java.util.Scanner;

public class MultipleOf5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		
		int n = sc.nextInt();
		
		if(n%5 == 0) {
			
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
		
	}

}
