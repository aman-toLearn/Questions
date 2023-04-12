package arrayquestions;

import java.util.Scanner;

public class SecondLargest {
	
	
	
	 static int secondLargest(int[] ar) {
		 
		 int l = Integer.MIN_VALUE,sl = Integer.MIN_VALUE;
		 for(int i = 0; i < ar.length; i++) {
			 if(ar[i]>l) {
				 sl = l;
				 l = ar[i];
				 
			 }
			 else if(ar[i] > sl) {
				 sl = ar[i];
			 }
		 }
		return sl;
	}
	
	
	

	public static void main(String[] args) {
        Scanner scan =   new Scanner(System.in);
        System.out.println("Enter size");
        int size = scan.nextInt();
        
     int[] ar   =  new int[size];
     
     for(int i = 0; i<ar.length; i++) {
    	 ar[i] = scan.nextInt();
     }
     
     int secondLarge = secondLargest(ar);
     System.out.println(secondLarge);
     
	}

	

}
