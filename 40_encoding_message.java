/* package codechef; // don't place package name! */

import java.util.*;

import javax.management.relation.Role;

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
            sc.nextLine();
            String s = sc.nextLine();
            char []roLe = s.toCharArray();
            // if(n%2 == 0){
            //     for(int i = 0 ; i < n/2 + 2; i+=2){
            //         char temp;
            //         temp = roLe[i];
            //         roLe[i] = roLe[i+1];
            //         roLe[i+1] = temp;
            //     }
            // }
            // else{
            //     for(int i = 0 ; i <= n/2 + 3; i+=2){
            //         char temp;
            //         temp = roLe[i];
            //         roLe[i] = roLe[i+1];
            //         roLe[i+1] = temp;
            //     }
                // }
                
            for (int i = 1; i < n; i+=2) {
            int z = roLe[i];
            roLe[i] = roLe[i-1];
            roLe[i-1] = (char)z;
        }
            
            for(int i = 0 ; i < n ; i++){
                int asc1 = (int)(roLe[i]) - 97;
                int asc2 = 122 - asc1;
                roLe[i] = (char)asc2;
            }

            // for(int i = 0 ; i < roLe.length ; i++){
            //     System.out.print(roLe[i]);
            // }
            // System.out.println();
            
            String result = "";
            for (int i : roLe) {
                result += (char) i;
            }
            
            System.out.println(result);
        }
		// your code goes here
	}
}
