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
		    String str = sc.next();
		    for(int i = 0 , j = i+1 ; j<n ; i++ , j++){
		        
		        if(str.charAt(i) == '0' && str.charAt(j) == '0'){
		            System.out.print("A");
		        }
		        else if(str.charAt(i) == '0' && str.charAt(j) == '1'){
		            System.out.print("T");
		        }
		        else if(str.charAt(i) == '1' && str.charAt(j) == '0'){
		            System.out.print("C");
		        }
		        else if(str.charAt(i) == '1' && str.charAt(j) == '1'){
		            System.out.print("G");
		        }
		        i++;
		        j++;
		    }
            System.out.println();
		    t--;
		}
	}
}
