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
	            
	            
	            int N = scan.nextInt();
	            
	            int X = scan.nextInt();
	            
	            if(N>X){
	                
	                System.out.println("NO");
	                
	                
	            }
	           else if(X%N == 0){
	                
	                System.out.println("YES");
	                
	                
	            }
	            else{
	                
	                System.out.println("NO");
	            }
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	    } catch(Exception e) {
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
