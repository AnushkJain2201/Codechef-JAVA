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
		    int y = sc.nextInt();
		    int []arr = new int[n];
		    for(int i = 0 ; i < n ; i++){
		        arr[i] = sc.nextInt();
		    }
            for(int j = 0 ; j < n ; j++){
                if(arr[j] <= y){
		            System.out.print("1");
		            y = y- arr[j];
		        }
		        else{
		            System.out.print("0");
		        }
            }
            System.out.println();
		    t--;
		}
	}
}
