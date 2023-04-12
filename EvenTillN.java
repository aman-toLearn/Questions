package classquestions;

import java.util.Scanner;

public class EvenTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		for(int i = 1; i <=N; i++) {
			
			if(i%2 == 0) {
				System.out.println(i);
			}
			
		}

	}

}
