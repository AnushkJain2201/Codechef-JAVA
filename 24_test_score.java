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
		// your code goes here
		int t = sc.nextInt();
		while(t>0){
		    float N = sc.nextInt();
		    float X = sc.nextInt();
		    float Y = sc.nextInt();
		    float res = (N/X)*Y;
		    if(res<=N){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    
		    t--;
		}
	}
}
