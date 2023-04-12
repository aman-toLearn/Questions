package classquestions;

import java.util.Scanner;

public class Table {
	
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the N");
	int N = scan.nextInt();
	
	for(int i = 1; i<=N; i++) {
		System.out.println(N+"X" +i + "="+ N*i);
	}
}

}
