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
            for(int i = 0 ; i < n ; i++){
                arr[i] = sc.nextInt();
            }
            int min = arr[0];
            for(int i = 1 ; i < n ; i++){
                if(arr[i]<arr[0]){
                    min = arr[i];
                }
            }
            int count = 0;
            for(int i = 0 ; i < n ; i++){
                if(arr[i]%min == 0){
                    count++;
                }
            }
            if(count == n){
                for(int i = 0 ; i < n ; i++){
                    System.out.print((arr[i]/min)+" ");
                }
                System.out.println();
            }
            else{
                for(int i = 0 ; i < n ; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
		// your code goes here
	}
}
