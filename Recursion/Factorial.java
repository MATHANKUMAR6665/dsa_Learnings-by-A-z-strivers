package Recursion;
import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n =sc.nextInt();
        System.out.println(fact(n));

    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n *fact(n-1);
    }
    
}
