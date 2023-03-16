import java.util.*;
class A{
    String ame;
    int ge;
    
    String enter;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] x = new Student[3];
        A y = new A();

        for(int i=0; i<x.length; i++){

            System.out.println("Enter Your Name");
            y.ame = sc.nextLine();
            System.out.println("Enter Your Age");
            y.ge = sc.nextInt();

            y.enter = sc.nextLine();


            x[i] = new Student(y.ame , y.ge);
        }



        for(int i=0; i<x.length; i++){
            System.out.println(x[i].name);
            System.out.println(x[i].age);
        }

        sc.close();
    }

}
class Student{
    String name;
    int age;
    
    
    Student(String name , int age){
        this.name = name;
        this.age = age;
    }
}

