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
            sc.nextLine();
            String s = sc.nextLine();
            boolean flag = true;
            for(int i = 0 ; i < n ; i++){
                int count = 0;
                for(int j = 0 ; j < n ; j++){
                    if(s.charAt(i) == s.charAt(j)){
                        count++;
                    }
                }
                if(count%2 == 0){
                    continue;
                }
                else{
                    flag = false;
                    break;
                }

            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
		// your code goes here
	}
}
