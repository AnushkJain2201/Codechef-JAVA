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
            int []arr = new int[5];
            for(int i = 0 ; i < 5 ; i++){
                arr[i] = sc.nextInt();
            }
            int chW = arr[1] - arr[0];
            int minG = arr[2]*arr[4];
            int maxG = arr[3]*arr[4];
            if(chW >= minG && chW <= maxG){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
		// your code goes here
	}
}
