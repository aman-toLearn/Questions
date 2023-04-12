package classquestions;

import java.util.Scanner;

public class OnlyFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter n ");
		int n = scan.nextInt();
		
		for(int i = 1; i <=n; i++) {
			
			if(n%i == 0) {
				
				System.out.println(i);
			}
		}

	}

}
