package level0;
//Three Digit number and multiple of 2, 5 and 10
//Check if a given number is three digit number and also it is a
//multiple for 2, 5, and 10
//Input Format:
//First line contains single integer n
//Output Format:
//Print Yes if it is three digit number and multiple of 2, 5 and 10, else
//No
import java.util.Scanner;

public class ThreeDigitNumandMof2a5a10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		if((n<= 999 && n >= 100 || n <= -100 && n>= -999)
				&& n%2 == 0
				&& n %5 == 0
				&& n%10 ==0) {
			
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
		}
			
		
	}

}
