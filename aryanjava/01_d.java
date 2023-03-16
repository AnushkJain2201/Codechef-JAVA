/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sr = new Scanner(System.in);
        char c1 = 'H', c2 = '.', c3 = 'T';
        int R;
        R = sr.nextInt();
        while (R > 0) {
            int len = sr.nextInt();
            String str = sr.next();
            isValid(str);
            // System.out.println(isValid(str));
            R--;
        }
    }

    static void isValid(String str) {
        if(str.length()==0){
            System.out.println("Invalid");
        }
        if (str.charAt(0) == '.') {
            System.out.println(1);
            isValid(str.substring(1));
        } 
        else if (str.charAt(0) == 'H') {
            System.out.println(2);
            String x = isV(str.substring(1));
            if (x.charAt(0) == 'Y') {
                System.out.println(3);
                isValid(x.substring(1));
            } else if (x.charAt(0) == 'S') {
                System.out.println(4);
                System.out.println("Valid");
            } else {
                System.out.println(5);
                // return "Invalid";
                System.out.println("InValid");
            }
        } 
        else if (str.charAt(0) == 'T') {
            System.out.println(6);
            // return "Invalid";
            System.out.println("InValid");
        } 
        else if (str.length() == 1) {
            System.out.println(7);
            // return "false";
            System.out.println("InValid");
        }
        // System.out.println(7);
        // return "kyapata";
    }
    
    static String isV(String str) {
        System.out.println(str);
        if (str.length() == 0) {
            System.out.println(8);
            return "N";
        } else if (str.charAt(0) == '.') {
            System.out.println(9);
            isV(str.substring(1));
        } else if (str.charAt(0) == 'H') {
            System.out.println(10);
            return "N";
        } else {
            System.out.println(11);
            if (str.length() == 1) {
                System.out.println(12);
                return "S";
            } else {
                System.out.println(13);
                
                return "Y" + str.substring(1);
            }
        }
        return "kyapata";
    }
}