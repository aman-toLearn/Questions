package arrayquestions;

import java.util.Scanner;

public class MaxProductInArray {
	
	public static int maxProduct(int[] ar) {
		
		
		int l = Integer.MIN_VALUE;int sl = Integer.MIN_VALUE;
		int m = Integer.MAX_VALUE; int sm = Integer.MAX_VALUE;
		
		for(int i=0; i<ar.length; i++) {
			
			if(ar[i]>l) {
				sl =l;
				l=ar[i];
			}
			else if(ar[i]>sl && ar[i]!=l) {
				sl = ar[i];
				
			}
			
			if(ar[i]<m) {
				sm =m;
				m = ar[i];
			}
			else if(ar[i]<sm && ar[i]!=m ) {
				sm = ar[i];
			}
		}
		
		
		
		
		
		
		int p1 = l*sl;
		int p2 = m*sm;
		
		if(p1>p2) {
			return p1;
		}
		
		return p2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q.-> find the maximum product of two integers in an array 
		//ex.->  [1,9,2,4,8,3,5,4,7,6]
		//o/p 72
		//*** we have to consider negative values also 
		// to find the maximum product first we will find largest and second largest 
		// for negative values find the smallest and second smallest 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scan.nextInt();
		
		
		int ar[] = new int[size];
		
		for(int i =0; i<ar.length;i++) {
			ar[i] = scan.nextInt();
		}
		
		int maxProduct = maxProduct(ar);
		
		System.out.println(maxProduct);

	}

}
