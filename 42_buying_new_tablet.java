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
		int t; Scanner in = new Scanner(System.in); t = in.nextInt();
		while(t-- > 0){
		    int N = in.nextInt();
		    int B = in.nextInt();
		   
		    int arr[] = new int[N];
		    
		    
		    for(int i=0;i<N;i++){
		        int w=in.nextInt();
		        int h=in.nextInt();
		        int price = in.nextInt();
		        if(price<=B){
		            arr[i]=w*h;
		        }
		    }
		    int max = arr[0];
		    for(int i=0; i<arr.length;i++){
		        if(arr[i]>max){
		            max=arr[i];
		        }
		    }
		    if(max==0){
		        System.out.println("no tablet");
		    }else{
		    System.out.println(max);
		    }
		    //test case bale loop start
		}
	}
}