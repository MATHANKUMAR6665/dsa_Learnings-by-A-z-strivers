package Recursion;
import java.util.Scanner;
public class Print_1_To_N {
    // here we are use the recursion to print the statements repeteadly so we are going to print 
    // numbers linearly using recursion
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        find1(1, n);
    }
     static void find(int start,int n){
        if(start>n){
            return;
        }
      System.out.print(start+" ");
      start++;
      find(start, n);

    }
    static void find1( int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        find1(i+1, n);
    }
}
