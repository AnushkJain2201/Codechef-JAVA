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
            int countOne = 0;
            int countZero = 0;
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            for(int i = 0 ; i < n ; i++){
                if(s.charAt(i) == '1'){
                    countOne++;
                }
                else{
                    countZero++;
                }
            }
            if(countZero == n && countOne == 0){
                System.out.println(0);
            }
            else if(countOne == n && countZero == 0){
                System.out.println(1);
            }
            else if(countZero == countOne){
                System.out.println(countOne);
            }
            else if(countZero<countOne){
                System.out.println(countZero + 1);
            }
            else if(countZero > countOne){
                System.out.println(countOne);
            }
        }
		// your code goes here
	}
}
