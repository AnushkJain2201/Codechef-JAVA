import java.util.Scanner;
class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fin;
        String sub;
        System.out.println("Enter Main String: ");
        fin = sc.nextLine();
        System.out.println("Enter String You Want To Find: ");
        sub = sc.nextLine();
        boolean flag = false;
        for(int i = 0 ; i<fin.length() ; i++){
            int s = 0;
            if(fin.charAt(i) == sub.charAt(s)){
                for(int j = i ; j < fin.length() && s < sub.length() ; j++ , s++){
                    if(fin.charAt(j) == sub.charAt(s)){
                        flag = true;
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
            }
        }
        if(flag == true){
            System.out.println("Found The String");

        }
        else{
            System.out.println("Not Found");
        }
        sc.close();
    }
    
}