package arrayquestions;

import java.util.Scanner;

public class MinOfAr {
	
	
	 static int minOfArray(int[] ar) {
		// TODO Auto-generated method stub
		 
		 int min = Integer.MAX_VALUE;
		 for(int element:ar) {
			 if(element<min) {
				 min = element;
			 }
		 }
		
		 return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scan.nextInt();
		
		int [] ar = new int[size];
		
		for(int i =0; i<ar.length; i++) {
			
			ar[i] = scan.nextInt();
			
		}
		int min = minOfArray(ar);
		System.out.println(min);

	}

	

}
