package Recursion;
import java.util.Scanner;
public class Print_N_To_1 {
    // this time we need to print the opposite direction we need to decrease the i value
    // to get the output
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        find1(n, 1);
        System.out.println();
        find2(n, n);

    }
    static void find1(int n,int i){
        if(n<1){
            return;
        }
        System.out.print(n+" ");
        n--;
        find1(n, i);
    }
    static void find2(int i,int n){
        if(i<1){
            return;
        }
        System.out.print(i+" ");
        find1(i-1,n);
    }
}
