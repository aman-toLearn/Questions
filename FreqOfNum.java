package arrayquestions;

import java.util.Scanner;

public class FreqOfNum {
	
	
	 static int frequencyOfNumber(int[] ar, int k) {
			// TODO Auto-generated method stub
		 int freq = 0;
		 
		 for(int element:ar) {
			 if(element == k) {
				 freq++;
			 }
		 }
			
		 return freq;
		}

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);	
	System.out.println("Enter size");
	int size = scan.nextInt();
	
	    int [] ar = new int[size];
	              
	              for(int i = 0; i<ar.length; i++) {
	            	  ar[i] = scan.nextInt();
	            	  
	              }
	              
	              System.out.println("Enter the k value");
	              int k = scan.nextInt();
	              
	            int freq =   frequencyOfNumber(ar,k);
	            System.out.println(freq);
	}

	

}
