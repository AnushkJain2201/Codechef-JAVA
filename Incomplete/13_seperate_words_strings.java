import java.util.Scanner;
class A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Sentence: ");
        String m = sc.nextLine();
        
        int count = 0;
        for(int i = 0 ; i < m.length() ; i++){
            if(m.charAt(i) == ' '){
                count++;
            }
        }
        int ns = 0;
        String []arr = new String[count + 1];
        for(int n = 0 ; n < arr.length ; n++){
            arr[n] = "";
        }
        for(int j = 0 ; j < m.length() ; j++){
            if(m.charAt(j) != ' '){
                arr[ns] = arr[ns] + m.charAt(j);
                
            }
            else{
                ns++;
            }
        }
        for(String fin : arr){
            System.out.println(fin);
        }
        sc.close();
    }
}