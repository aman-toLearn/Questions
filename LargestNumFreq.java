package arrayquestions;

import java.util.Scanner;

public class LargestNumFreq {
	
	static int largest(int[] ar) {
		int largest = Integer.MIN_VALUE;
		
		for(int element:ar) {
			if(element>largest) {
				largest = element;
				
			}
		}
		
		return largest;
	}
	
	
	static int largestNumFreq(int[] ar ,int largest) {
		
		int freq = 0; 
		
		for(int element:ar) {
			if(element == largest) {
				freq++;
			}
		}
		
		return freq;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size");
		int size = scan.nextInt();
		
		int[] ar = new int[size];
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		
		int largest = largest(ar);
	
		int freq  = largestNumFreq(ar,largest);
		System.out.println(freq);

	}

	
}
