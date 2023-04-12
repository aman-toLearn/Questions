package arrayquestions;

import java.util.Scanner;

public class IndexOfGivenNum {
	
	
	
	 static int findIndex(int[] ar, int number) {
		// TODO Auto-generated method stub
		 
		 for(int i=0; i<ar.length; i++) {
			 if(ar[i] == number) {
				 return i;
			 }
		 }
		return -1;
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scan.nextInt();
	int [] ar 	= new int[size] ;
	
	for(int i = 0; i < ar.length; i++) {
		ar[i] = scan.nextInt();
		
	}
	System.out.println("Enter the number");
	int number = scan.nextInt();
	
	int index = findIndex(ar,number);
	System.out.println(index);

	}

	

}
