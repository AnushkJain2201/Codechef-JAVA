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
	    int resP = 0;
	    int resQ = 0;
		int pA = sc.nextInt();
		int pB = sc.nextInt();
		int qA = sc.nextInt();
		int qB = sc.nextInt();
		if(pA>=pB){
		    resP = pA;
		}
		else{
		    resP = pB;
		}
		
		if(qA>=qB){
		    resQ = qA;
		}
		else{
		    resQ = qB;
		}
		
		if(resP > resQ){
		    System.out.println("Q");
		}
		else if(resP<resQ){
		    System.out.println("P");
		}
		else{
		    System.out.println("TIE");
		}
	}
}
