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
		    
	
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T>0){
		    
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    int K = sc.nextInt();
		    
		    if(K*M<N){
		        System.out.println("no");
		    }else{
		    System.out.println("yes");
		    }
		}
		} catch(Exception e) {
		}
	}
}
