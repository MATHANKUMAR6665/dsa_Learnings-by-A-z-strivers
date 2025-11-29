package PATTERNS;
import java.util.Scanner;
public class Pattern_12 {
    /*
    1                     1
    1 2                 2 1
    1 2 3             3 2 1 
    1 2 3 4         4 3 2 1 
    1 2 3 4 5     5 4 3 2 1 
    1 2 3 4 5 6 6 5 4 3 2 1 

    we need to print this pattern so we need to analyze this pattern and break into the sub problem and then we can solve this

    pattern is that identify that nuumbers , space,numbers
    in deep analyze the starting number is asc and then space and then last number is in desc so we need to come in reverse order.

    //  formula for numbers   -->  j<=i;     this is for ascending order
    //  formula for spaces is -->  2 * n-2;
    //  formula for numbers  -->   j>=i;     this is for descending numbers 

    so finally we can print according to the pattern with the above details.
    */
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of N ");
        int N =sc.nextInt();
        find1(N);
    }
    static void find1(int N){
         int spaces = 2 * (N-1);
        for(int i=1;i<=N;i++){
           
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            spaces-=2;
        }
    }
}
