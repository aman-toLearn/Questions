package arrayquestions;

import java.util.Scanner;

public class SmallestNumFreq {
	
	
	 static int freqOfSmallest(int[] ar, int smallest) {
		// TODO Auto-generated method stub
		 int freq = 0;
		 for(int i =0; i<ar.length; i++) {
			 
			 if(ar[i] == smallest) {
				 freq++;
			 }
		 }
		return freq;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	 static int smalleast(int[] ar) {
		int small = Integer.MAX_VALUE;
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i]<small) {
				small = ar[i];
			}
		}
		
		
		return small;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size ");
		int size = sc.nextInt();
		
	int []	ar = new int[size];
	
	for(int i=0; i<ar.length; i++) {
		ar[i] = sc.nextInt();
		}
	
	int smallest = smalleast(ar);
	//System.out.println(smallest);
	
	int freq = freqOfSmallest(ar,smallest);
	System.out.println(freq);
	}

	

	

}
