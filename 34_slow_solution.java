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
            int[] arr = new int[3];

            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
               
            }
             // for(int k=0;k<3;k++){
                // System.out.println(arr[i]);
                // }
            int x, y;
            x = arr[2] / arr[1];
            y = arr[2] % arr[1];
            int sum = 0;
            if (x < arr[0]) {
                for (int j = 0; j < x; j++) {
                    sum += arr[1] * arr[1];
                }
                sum += y * y;
                System.out.println(sum);
            } else {
                for (int j = 0; j < arr[0]; j++) {
                    sum += arr[1] * arr[1];
                }
                sum += y * y;
                System.out.println(sum);
            }
        }

        t--;
    }
    // your code goes here
}
