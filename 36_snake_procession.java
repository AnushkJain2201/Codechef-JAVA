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
	    int r = sc.nextInt();
	    while(r-- > 0){
	        int l = sc.nextInt();
	        sc.nextLine();
	        String str = sc.nextLine();
	        ArrayList<Integer> listh = new ArrayList<Integer>();
	        ArrayList<Integer> listt = new ArrayList<Integer>();
	        ArrayList<Integer> listdot = new ArrayList<Integer>();
	        int h = 0, t = 0, count = 0;
	        boolean flag = false , flag2 = true;
	        for(int i = 0 ; i < str.length() ; i++){
	            if(str.charAt(i) == 'H'){
	                listh.add(i);
	            }
	            else if(str.charAt(i) == 'T'){
	                listt.add(i);
	            }
	            else{
	                listdot.add(i);
	            }
	        }

            
	        if(listh.size() == listt.size()){
                for(int i = 0 ; i < listh.size() - 1 ; i++){
                    if(listt.get(i) > listh.get(i+1)){
                        flag2 = false;
                    }
                }
	            for(int i = 0 ; i < listh.size()  ; i++){
	                if(listh.get(i) < listt.get(i) && flag2){
	                    count++;
	                    flag = true;
	                }
	                else{
	                    flag = false;
	                    break;
	                }
	            }
	        }

            
	        
	        if(listdot.size() == str.length()){
	            System.out.println("Valid");
	        }
	        
	        else if(count == listh.size() && flag == true){
	            System.out.println("Valid");
	        }
	        else{
	            System.out.println("Invalid");
	        }
	        
	        
	        
	    }
		// your code goes here
	}
}