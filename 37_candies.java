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
	        int []arr = new int[2*n];
	        for(int i = 0 ; i < 2*n ; i++){
	            arr[i] = sc.nextInt();
	        }
	        boolean flag = true;
	        for(int i = 0 ; i < 2*n ; i++){
	            int count = 0;
	            for(int k = 0 ; k < 2*n ; k++){
	                if(arr[i] == arr[k]){
	                    count++;
	                }
	            }
	            if(count > 2){
	                flag = false;
	                break;
	            }
	        }
	        if(flag == false){
	            System.out.println("No");
	        }
	        else{
	            System.out.println("Yes");
	        }
	    }
		// your code goes here
	}
}
