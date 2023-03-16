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
		int l = sc.nextInt();
        sc.nextLine();
		while(l>0){
		    String s = sc.nextLine();
		    String t = sc.nextLine();
            
		    for(int i = 0; i < s.length() ; i++){
		        if(s.charAt(i) == t.charAt(i)){
		            System.out.print("G");
		        }
		        else{
		            System.out.print("B");
		        }
		    }
		    System.out.println();
		    l--;
		}
	}
}
