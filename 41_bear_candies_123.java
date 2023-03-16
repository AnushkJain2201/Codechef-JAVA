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
        while(t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int li = 1;
            int bo = 2;
            int sumLi = 1;
            int sumBo = 2;
            boolean flag = true;
            while(true){
                if(sumLi <= a){
                    li+=2;
                    sumLi+=li;
                }
                else{
                    System.out.println("Bob");
                    break;
                }

                if(sumBo <= b){
                    bo+=2;
                    sumBo+=bo;
                }
                else{
                    System.out.println("Limak");
                    break;
                }
            }
        }
		// your code goes here
	}
}
