package classquestions;

import java.util.Scanner;

public class CommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter m ");
		int m = scan.nextInt();
		System.out.println("Enter n ");
		int n = scan.nextInt();
		
		for(int i = m; i >=1; i--) {
			
			if(m%i == 0 && n%i == 0) {
				
				System.out.println(i);
				
			}
		}

	}

}
