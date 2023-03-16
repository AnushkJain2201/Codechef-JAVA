/* package codechef; // don't place package name! */

import java.util.*;



/* Name of the class has to be "Main" only if the class is public. */
class A
{
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		int cas;
		double N;
	    double X;
	    double Y;
		cas = sc.nextInt();
        sc.nextLine();
        while(cas>0){
            N= sc.nextInt();
		    X= sc.nextInt();
		    Y= sc.nextInt();
		
		    double res = (N/X);
		
		    if(res <= Y){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }   
            cas--;
		    
	    }
        sc.close();
    }
}
