package PATTERNS;

import java.util.Scanner;

public class Pattern_6 {
    /*
    1 2 3 4 5 
    1 2 3 4 
    1 2 3 
    1 2 
    1 

    THis is the same format but we need to print the j instead of stars
    */  public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the value of n");
        int N =sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
