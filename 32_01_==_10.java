/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
	    int t = sc.nextInt();
	    while(t > 0){
	        int n = sc.nextInt();
	        String []x = new String[n];
	        if(n%2 == 0){
	            for(int i = 0; i < n ; i++){
	                if(i == n/2 || i == n/2 - 1){
	                    x[i] = "0";
                        // System.out.println(0);
	                }
	                else{
                        x[i] = "1";
                        // System.out.println(1);
	                }
	            }
	        }
	        else {
                for(int i = 0 ; i < n ; i++){
                    if(i%2 == 0){
                        x[i] = "0";
                        // System.out.println(0);
	                }
	                else{
                        x[i] = "1";
                        // System.out.println(1);
	                }
	            }
	        }
	        // String str = "";
	        for(int i = 0 ; i <  n ; i++){
	            // str.concat(x[i]);
                System.out.print(x[i]);
	        }
	        t--;
            System.out.println();
	    }
		// your code goes here
	}
}
