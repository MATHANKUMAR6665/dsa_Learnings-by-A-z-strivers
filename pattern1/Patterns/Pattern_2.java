package PATTERNS;
import java.util.Scanner;
public class Pattern_2 {
    /*
    *
    * *
    * * *
    * * * *
    * * * * *
    
    // for this pattern analyse that it need to loops one loop is for outer loop and another is for inner loop
    first row is usual thing we need to play with the coloums  so this pattern the first line print one time and the second line 
    print two time like wise it print.
    so we need to match with the outer loop
    */
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N : ");
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
