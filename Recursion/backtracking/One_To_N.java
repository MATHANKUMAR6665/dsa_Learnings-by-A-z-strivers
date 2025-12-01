package Recursion.backtracking;
import java.util.Scanner;
public class One_To_N {
    /*
    This is the back tracking method in this method it will back track the proccess 
    in usual recurssion it will print first and then it will make a function call but now 
    it will make a function call first and then it will print in the revrse track which is the
    reverse track or back tracking order and then  it will print
    
    note --> we need to write the code according to the problem statement whether what we need to pring in the 
    output line so that we need to play according to the requirements*/
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n =sc.nextInt();
        System.out.println("enter the value of i :");
        int i =sc.nextInt();
        find(n, n);
    }
    static void find(int i,int n){
        if(i<n){
            return;
        }
        find(i-1, n);
        System.out.print(i+" ");
    }

}
