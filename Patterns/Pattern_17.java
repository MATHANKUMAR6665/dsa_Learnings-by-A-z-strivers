package PATTERNS;
import java.util.Scanner;
public class Pattern_17 {
    /*
          A
        A B A
      A B C B A 
    A B C D C B A 

    HERE WE NEED to analyze the patern here we are print the concept first in asc and then next in dsc

    */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n ");
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
           
            for(int j=0;j<n-i-1;j++){
                System.err.print(" ");
                
            }
             char ch = 'A';
            for(int j=0;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            ch-=2;
            for(int j=0;j<i;j++){
                System.out.print(ch);
                ch--;
            }
               for(int j=0;j<n-i-1;j++){
                System.err.print(" ");
                
            }
            System.out.println();
        }
    }
}
