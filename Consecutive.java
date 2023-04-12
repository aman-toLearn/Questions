package arrayquestions;

import java.util.Scanner;

public class Consecutive {
	
	 static int  longestConsecutive(int[] ar) {
		 
		 int count = 1;
		 int max = 0; 
		 for(int i = 0; i<ar.length-1; i++) {
			 
			 if(ar[i] == ar[i+1]) {
				 
				 count++;
			 }
			 else {
				 
				 if(count>max) {
					 
					 max = count;
				 }
				 count = 1;
			 }
		 }
		 if(count>max) {
			 
			 max = count;
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		return max;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Q. Given an sorted array of integers find the length of 
		//longest consecutive elements sequence .
		
		// ar-> [2,2,2,3,3,3,3,5,6,6]
		//o/p-> 4
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scan.nextInt();
		
		     int[] ar =new int[size];
		     
		     System.out.println("Enter sorted elements");
		     
		     for(int i = 0; i< ar.length; i++) {
		    	 
		    	 ar[i] = scan.nextInt();
		     }
		     
		     
		    int maxc =  longestConsecutive(ar);
		    System.out.println(maxc);
		
	}

	
}
