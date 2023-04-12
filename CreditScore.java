package Problems;

import java.util.Scanner;

public class CreditScore {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		if (X >= 750) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
