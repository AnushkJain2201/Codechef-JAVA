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
		int n = sc.nextInt();
		sc.nextLine();
		while(n>0){
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    if(X == Y){
		        System.out.println("NEUTRAL");
		    }
		    else if(X > Y){
		        System.out.println("LOSS");
		    }
		    else{
		        System.out.println("PROFIT");
		    }
		    n--;
		}
		sc.close();
	}
}
