package PATTERNS;
import java.util.Scanner;
public class Pattern_3 {
    /*
    1
    1 2
    1 2 3
    1 2 3 4 
    1 2 3 4 5 
    
    // here we need to print the j value cus that is in increasing order
    */
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N ; ");
        int N =sc.nextInt();
        
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
