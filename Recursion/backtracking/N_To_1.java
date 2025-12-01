package Recursion.backtracking;
import java.util.Scanner;
public class N_To_1 {
    /*
    Here is a backtracking method but this time we need to print the n to 1 values using the back tracking we must use the 
    set of rules and regulations and things are been used for the further things
    first we need to initialize the variables and then we need to write the code
    */
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int  n= sc.nextInt();
        System.out.println("enter the i value");
        int i = sc.nextInt();
        find(n, i);

    }
    static void find(int n,int i){
        if(i>n){
            return;
        }
        find(n, i+1);
        System.out.print(i+" ");
    }
}
