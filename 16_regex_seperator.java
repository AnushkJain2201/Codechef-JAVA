// Write a program to accept a character regex from user and use this regex as a seperator of words in sentence
import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String sen;
        char ch;
        int count = 0, j = 0;
        System.out.println("Enter a sentence: ");
        sen = sr.nextLine();
        System.out.println("Do you want to use space as a delimiter? If yes then enter y otherwise enter n");
        char choice = sr.next().charAt(0);
        if (choice == 'y') {

            for (int i = 0; i < sen.length(); i++) {
                if (sen.charAt(i) == 32)
                    count++;
            }
            // System.out.println(count);

            String[] a = new String[(count + 1)];
            for (int i = 0; i < a.length; i++) {
                a[i] = "";
            }
            for (int i = 0; i < sen.length(); i++) {
                if (sen.charAt(i) != 32)
                    a[j] = a[j] + sen.charAt(i);
                else
                    j++;
            }
            for (String l : a) {
                System.out.println(l);
            }
        } else if (choice == 'n') {

            System.out.println("Enter a character regex to be used as a seperator: ");
            ch = sr.next().charAt(0);

            for (int i = 0; i < sen.length(); i++) {
                if (sen.charAt(i) == ch) {
                    count++;
                }
            }

            if (sen.charAt(0) == ch) {
                String[] arr = new String[count];

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = "";
                }
                j = -1;
                for (int i = 0; i < sen.length(); i++) {
                    if (sen.charAt(i) != ch)
                        arr[j] = arr[j] + sen.charAt(i);
                    else
                        j++;
                }
                System.out.println("The seperated string is as follows: ");
                for (String l : arr) {
                    System.out.println(l.trim());
                }
            } else {
                String[] arr = new String[(count + 1)];

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = "";
                }
                for (int i = 0; i < sen.length(); i++) {
                    if (sen.charAt(i) != ch)
                        arr[j] = arr[j] + sen.charAt(i);
                    else
                        j++;
                }
                System.out.println("The seperated string is as follows: ");
                for (String l : arr) {
                    System.out.println(l.trim());
                }
            }
        } else {
            System.out.println("Invalid choice");
        }
        sr.close();
    }
}