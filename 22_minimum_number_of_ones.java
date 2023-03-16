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
		while(t>0){
            
            int n = sc.nextInt();
            int []arr = new int[n];
            int count = 0;
            
            int i = 0;
            while(i<n){
                // if(i%2==0){
                //     arr[i] = 0;
                // }
                if(i%2 != 0){
                    arr[i] = 1;
                    count++;
                }
                i++;
                
            }
		    System.out.println(count);
		    t--;
		}
	}
}
