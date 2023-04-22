/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		    int N = sc.nextInt();
		    String S = sc.next();
		    int minSteps = 0, i=0;
		    for(i=0; i<N-1; i++){
		        Character ch1 = S.charAt(i);
		        Character ch2 = S.charAt(i+1);
		        if(ch1.equals(ch2)){
		            i++;
		        }
		        minSteps++;
		    }
		    if(i<N)
		        minSteps++;
	        System.out.println(minSteps);
		    T--;
		}
	}
}