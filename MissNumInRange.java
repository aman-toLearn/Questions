package arrayquestions;

import java.util.Scanner;

public class MissNumInRange {
	
	 static int missingNum(int[] ar) {
		// TODO Auto-generated method stub
		 int sum1 = 0;
		 int n = ar.length +1;
		 for(int i = 0; i<ar.length; i++) {
			 
			 sum1 = sum1+ar[i];
		 }
		 
		int sum2 = n*(n+1)/2;
		
		return sum2-sum1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size ");
		int size = scan.nextInt();
		
		int [] ar = new int[size];
		//we have to enter the array values between 1 to .....size+1
		//bcoz it is in range 
		
		for(int i = 0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
		}
		
		missingNum(ar);
		System.out.println(missingNum(ar));

	}

	

}
