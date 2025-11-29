package PATTERNS;
import java.util.Scanner;
public class Pattern_15 {
    /*
    A B C D E
    A B C D 
    A B C 
    A B 
    A 

    THIS ALSO same format we need to play with the printing startement

    */
     public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the value of n");
        int N =sc.nextInt();
        for(int i=0;i<N;i++){
            char ch='A';
            for(int j=1;j<=N-i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
