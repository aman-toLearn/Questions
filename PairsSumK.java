package arrayquestions;

import java.util.Scanner;

public class PairsSumK {
	
	

	 static void pairSumK(int[] ar,int k) {
		 
		 for(int i = 0; i<ar.length; i++) {
			 
			 for(int j = i+1; j<ar.length;j++) {
				 if(ar[i] + ar[j] == k) {
					 
					 System.out.println(ar[i] + "  " + ar[j]);
				 }
			 }
		 }
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size ");
		int size = scan.nextInt();
		
		       int[] ar       =  new int[size];
		 
		       for(int i = 0; i<ar.length; i++) {
		    	   ar[i] = scan.nextInt();
		       }
		       int k = scan.nextInt();
		       
		       pairSumK(ar,k);
		
	}

}
