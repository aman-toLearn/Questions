package arrayquestions;

import java.util.Scanner;

public class MaxOfAr {
	
	
	
	static int  maxOfArray(int[] ar)
	{
		
		int max = Integer.MIN_VALUE;
		for(int element:ar) {
			if(element>max) {
				//System.out.println(element>max);
				max = element;
			}
		}
		return max;
		//System.out.print(max);
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter size");
		int size = scan.nextInt();
		//int max = Integer.MIN_VALUE;
		    int [] ar = new int[size];
		    
		    
		    for(int i=0; i<ar.length; i++) {
		    	ar[i] = scan.nextInt();
		    }
		    
		   int max = maxOfArray(ar);
		   System.out.println(max);
		    

	}

}
