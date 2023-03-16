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
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a!=0)
		{
		    int n=sc.nextInt();
		    int h=sc.nextInt();
		    if(n%2==0)
		    System.out.println("yes");
		    else
		    if(h%2==0)
		    System.out.println("no");
		    else
		    System.out.println("yes");
		    a--;
		}
	}
}
