package Recursion.FunctionalWise;
import java.util.Scanner;
public class Sum_Of_N_Numbers {
    //here we are going to do the sum of n numbers using the functional methods
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the n values");
        int n =sc.nextInt();
        System.out.println(find(n));

    }
    static int find(int n){
        if(n==0){
            return 0;
        }
        return n +find(n-1);
    }
    
}
