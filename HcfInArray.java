package classquestions;

import java.util.Scanner;

public class HcfInArray {
	
	
	static int hcf(int a , int b) {
		int result = 0;
		for(int i =1; i<=a; i++) {
			if(a%i==0 && b%i==0) {
				result = i;
			}
		}
		
		return result;
	}
	
	
	static int highestCommonFactor(int[] ar) {
		// TODO Auto-generated method stub
		
	int result = 	hcf(ar[0],ar[1]);
		 
		 for(int i = 2; i< ar.length; i++) {
			 
			 result = hcf(result,ar[i]);
			 
			 
			 
			 
			 
			 
		 }
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size of array");
		
		int m = scan.nextInt();
		
		int[] ar = new int[m] ;
		for(int j = 0; j< ar.length;j++) {
			ar[j] = scan.nextInt();
		}
		System.out.println(highestCommonFactor( ar));
		

	}

	 

}
