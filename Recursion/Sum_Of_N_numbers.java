package Recursion;
import java.util.Scanner;
public class Sum_Of_N_numbers {
    //this is the program we are going to solve that soum of n numbers using recursion
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n =sc.nextInt();
        find(n,0);

    }
   static void find(int n,int sum){
    if(n<1){
        System.out.print(sum+" ");
        return;
    }
    find(n-1, sum+n);
   }
}
