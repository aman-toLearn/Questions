package classquestions;

import java.util.Scanner;

public class NToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number");
		int N = scan.nextInt();

		
		//using for loop
//		for(int i = N; i >0; i--) {
//			System.out.println(i);
//			
//		}
		
		//i don't waana make use of variable i 
		
//		for (    ; N>0     ; N--   ) {
//			System.out.println(N);
//			
//		}
		
		//using while loop
		
//		while(N>0) {
//			System.out.println(N);
//			N--;
//		}
//		
		//while loop that executes only n times 
		while(N-- > 0) {
			//System.out.println("Hello");
			System.out.println(N);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
