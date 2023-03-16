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
		int t=sc.nextInt();
		while(t-- >0)
		{
		    int n=sc.nextInt();
		    int[] binarray=new int[n];
		    int i,count=0;
		    for(i=0;i<binarray.length;i++)
		    {
		        binarray[i]=sc.nextInt();
		        if(binarray[i]==1)
		            count++;
		    }
		    if(count%2==0)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
        sc.close();
	}
}
