package arrayquestions;

import java.util.Scanner;

public class MinMaxSum {
	
	
	 static int sum(int[] ar) {
		// TODO Auto-generated method stub
		 int sum =0;
		 for(int element:ar) {
			 sum +=element;
		 }
		return sum;
	}
	 
	 
	 static int min(int[] ar) {
		 int min = Integer.MAX_VALUE;
		 
		 for(int element:ar) {
			 if(element<min) {
				 min = element;
			 }
		 }
		
		 return min;
	 }
	 
	 
	 static int max(int[] ar) {
		 
		 int max = Integer.MIN_VALUE;
		 for(int element:ar) {
			 if(element>max) {
				 max = element;
			 }
		 }
		 return max;
	 }
	 
	static int  minSum(int sum,int max){
		 
		return (sum-max);
	 }
	
	static int  maxSum(int sum,int min){
		 
		return (sum-min);
	 }
	 
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scan.nextInt();
		
		int [] ar = new int[size];
		
		for(int i = 0; i<ar.length; i++) {
			ar[i] = scan.nextInt();
			
		}
		int sum = sum(ar);
		int min = min(ar);
		int max = max(ar);
		
		System.out.println(minSum(sum,max) + " " +maxSum(sum,min));
		
		minSum(sum,max);
		maxSum(sum,min);

	}

	

}
