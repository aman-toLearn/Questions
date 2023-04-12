package arrayquestions;

import java.util.Scanner;

public class SumOfAr {
	
	
	static void  sumOfArray(int [] ar) {
		int sum = 0; 
		for(int element: ar) {
			sum += element;
		}
		System.out.println(sum);
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size");
		int size = scan.nextInt();
		
		    int[] ar =  new int[size];
		    for(int i=0; i<ar.length; i++) {
		    	ar[i] = scan.nextInt();
		    }
		    sumOfArray(ar);

	}

}
