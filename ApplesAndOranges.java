package Problems;

import java.util.Scanner;

public class ApplesAndOranges {
	
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	int X = sc.nextInt();
	
	int A = sc.nextInt();
	
	int  B = sc.nextInt();
	
	if(A+B >= X) {
		
		System.out.println("Yes");
	}
	
	else {
		System.out.println("No");
	}
}

}
