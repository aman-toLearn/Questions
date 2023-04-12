package arrayquestions;

import java.util.Scanner;

public class ShortHandOfSortedArray {
	
	static String shortHand(int[] ar) {
		String res = "";
		int count = 1;
		
		for(int i= 0; i< ar.length-1; i++) {
			
			if(ar[i] == ar[i+1]) {
				
				count++;
			}
			
			else {
				res = res + count + ar[i];
				 count = 1;
			}
			
		}
		res = res + count + ar[ar.length-1];
		
		
		
		
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//what is shorthand 
		//ex ar-> [3,3,4,4,4,5,6,6,6,6]
		//output 2,3,3,4,1,5,4,6
		//means 2 times 3 , 3 times 4, 1 time 5, 4 times 6
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scan.nextInt();
		
		int [] ar = new int[size];
		
		for(int i = 0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		System.out.println(shortHand(ar));
		

	}

}
