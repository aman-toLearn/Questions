package classquestions;

import java.util.Scanner;

public class NNaturalNumbers {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int N = scan.nextInt();
		
		
//		for(int i = 1; i<=N; i++) {
//			System.out.println(i);
//		}
		int i = 1;
		while(i<=N) {
			System.out.println(i);
			i++;
		}
		
	}
}
