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
        while(t-- > 0){
            int n = sc.nextInt();
            int []arr = new int[n];
            int count = 0;
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
                if(arr[i]%2 != 0){
                    count++;
                }
            }
            if(count%2 != 0 && n>1){
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }
        }
		// your code goes here
	}
}
