package arrayquestions;

import java.util.Scanner;

public class FirstRepeatedNumInSortedArray {
	
	static int firstRepeatedNum(int[] ar) {
		
		for(int i = 0; i<ar.length-1; i++) {
			
			if(ar[i] == ar[i+1]) {
				
				return ar[i];
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size");
		
		int size = scan.nextInt();
		
		int[] ar = new int[size];
		
		System.out.println("Enter sorted array ");
		
		for(int i = 0; i< ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		
		int rp = firstRepeatedNum(ar);
		System.out.println(rp);

	}

}
