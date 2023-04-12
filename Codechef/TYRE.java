/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		    
	
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		while(T>0){
		    
		    int N = scan.nextInt();
		    int M = scan.nextInt();
		    
		    int Tyres = (N*2) + (M*4);
		    System.out.println(Tyres);
		}
		
		} catch(Exception e) {
		}
		
		
	}
}
