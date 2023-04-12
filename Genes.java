package Problems;

import java.util.Scanner;

public class Genes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter");
		char p1 = sc.next().charAt(0);
		char p2 = sc.next().charAt(0);
		
		if(p1 == 'R' || p2 == 'R') {
			System.out.println("R");
		}
		else if (p1 == 'B' || p2 == 'B') {
			System.out.println("B");
		}
		else {
			System.out.println("G");
		}
		
	}

}
