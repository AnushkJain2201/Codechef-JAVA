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
		Scanner sc= new Scanner (System.in);
		int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] x= new int[n];
            for(int i=0;i<n;i++){
                x[i]=sc.nextInt();
            }
            int res=-1;
            for(int i=0;i<n;i++){
                int count=1;
                for(int j=i+1;j<n;j++){
                    if(x[i]==x[j]){
                        count++;
                    }
                }
                if(res<count){
                    res=count;
                }
            }
            System.out.println(n-res);
        }
	}
}