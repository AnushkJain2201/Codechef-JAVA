import java.util.Scanner;
class A{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int count;
    
        System.out.println("Enter A String Whom You Want To Apply Trim: ");
        String str1 = sc.nextLine();
        String fin = "";
        // String []fin = new String[0];
        for(int i = 0 ; i<str1.length() ; i++){
            if(str1.charAt(i) != ' '){
                fin = fin + str1.charAt(i);
                
            }


        }
        System.out.println(fin);
        
        sc.close();
    }
    
}