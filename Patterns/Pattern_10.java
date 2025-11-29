package PATTERNS;
import java.util.Scanner;
public class Pattern_10 {
    /*
      *
      * *
      * * *
      * *
      * 
      
    THis is the pattern we need to analyze this first and i said we can solve this in diff way so one way is that 
    comination of two methods 
    and anther one is the new method

    */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int N = sc.nextInt();
        method1(N);
        method2(N);
    }
    static void method1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
static void method2(int n){
    for(int i=0;i<=2 *n-1;i++){
        int starts =i;
        if(i>n){
            starts= 2 * n -i;
        }
        for(int j=1;j<=starts;j++){
            System.out.print("* ");

        }
        System.out.println();
    }
}
}
