package arrayquestions;

import java.util.Scanner;

public class EvenNumInAr {
	
	 static void evenNumbers(int[] ar) {
		// TODO Auto-generated method stub
		//int elements;
		for(int element:ar) {
			
			if(element %2==0) {
				System.out.println(element);
			}
			
		}
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter size ");
			int size = scan.nextInt();
			
			int[] ar = new int[size];
			
			for(int i=0; i<ar.length; i++) {
				ar[i]= scan.nextInt();
			}
			evenNumbers(ar);
	}

	

}
