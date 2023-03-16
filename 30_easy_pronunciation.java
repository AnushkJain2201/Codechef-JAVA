/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String st = sc.next();
            int count = 1;
            for (int i = 0; i < n; i++) {
                if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o'
                        || st.charAt(i) == 'u') {
                    continue;
                } else {
                    if (n - (i + 1) >= 3) {
                        int lol = i + 1;
                        for (int j = 0; j < 3; j++) {
                            if (st.charAt(lol) == 'a' || st.charAt(lol) == 'e' || st.charAt(lol) == 'i'
                                    || st.charAt(lol) == 'o' || st.charAt(lol) == 'u') {
                                break;
                            } else {
                                lol++;
                                count++;
                                
                            }
                        }
                    }
                }
                // your code goes here
            }
            if(count >= 4){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            t--;
        }
    }
}
