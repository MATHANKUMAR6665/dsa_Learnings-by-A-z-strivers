package PATTERNS;
import java.util.Scanner;
public class Pattern_18{
    /*
    E
    D C
    C D E 
    B C D E 
    A B C D E
    FIRST WE need to analyze the things and need to analyze the pattern and then find the output
    */
   public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        for(char ch=(char) ('E'-i);ch<='E';ch++){
            System.out.print(ch+" ");
        }
        System.out.println();
    }
   }
}