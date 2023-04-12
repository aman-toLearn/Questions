package arrayquestions;

import java.util.Scanner;

public class PairDiffK {
	
	static void pairDiffK(int[] ar, int k) {
		
		for(int i = 0; i<ar.length; i++) {
			for(int j = i+1; j<ar.length; j++) {
				if(ar[i]-ar[j]==k || ar[j]-ar[i]==k) {
					
					System.out.println(ar[i] + " " + ar[j] + "=" + (ar[i]-ar[j]));
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scan.nextInt();
		
	int[]ar 	= new int[size];
	
	for(int i = 0; i<ar.length; i++) {
		ar[i] = scan.nextInt();
	}
	
	int k = scan.nextInt();
	
	pairDiffK(ar,k);
		
	}

}
