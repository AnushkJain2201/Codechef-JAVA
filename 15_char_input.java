import java.util.Scanner;
class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character: ");
        char x = sc.next().charAt(0);
        System.out.println(x);
        sc.close();
    }
}