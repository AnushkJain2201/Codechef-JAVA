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
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int x[] = new int[n];
            for(int i=0;i<n;i++){
                x[i]=sc.nextInt();
            }
            boolean flag=true;
            int avail=0,index=0;
            for(int i=0;i<n;i++){
                avail=x[i]+avail;
                if(avail>=k){
                    avail=avail-k;
                }
                else{
                    index=i;
                    flag=false;
                    // avail=avail+x[i];
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO "+(index+1));
            }
        }
	}
}