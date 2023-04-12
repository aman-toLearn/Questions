/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    try {
	        
	        Scanner scan = new Scanner(System.in);
	        int T = scan.nextInt();
	        
	        while(T>0){
	            
	           int X = scan.nextInt();
	           if(X%10 == 0){
	               
	               System.out.println(X/10);
	           }
	           else if(X%5 == 0){
	               
	               System.out.println(((X/5)/2)+1);
	           }
	           else{
	               
	               System.out.println(-1);
	           }
	            
	            
	            
	        }
	        
	    } catch(Exception e) {
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
