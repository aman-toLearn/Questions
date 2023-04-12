package arrayquestions;

import java.util.Scanner;

public class arrayintro {

	public static void main(String[] args) {

			// new int[size]; means memory is allocated in heap area 
		System.out.println("Enter size of array ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] ar = new int[size];
		
		//take input for array 
		for(int i =0; i<ar.length; i++) {
			 ar[i]  = scan.nextInt();
			}
		//to print
		for(int i =0; i<ar.length; i++) {
			 System.out.print(" "+ ar[i]);
			   
			}
		
	}

}
