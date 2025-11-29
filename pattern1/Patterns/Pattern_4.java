package PATTERNS;
import java.util.Scanner;
public class Pattern_4 {
    /*
    1
    2 2 
    3 3 3 
    4 4 4 4
    5 5 5 5 5 
    here the same thing but we need to print the value of i
    */
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the valueof N: ");
        int N =sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
