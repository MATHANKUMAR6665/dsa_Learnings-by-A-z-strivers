package PATTERNS;

import java.util.Scanner;

public class Pattern_16 {
    /*
    A
    B B
    C C C 
    D D D D
    E E E E E

    THis is also a same concept we need to play withthe printing
    */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int N = sc.nextInt();
        find1(N);
    }
     static void find1(int N ){
       char ch='A';
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                System.out.print(ch +" ");
               
            }
            ch++;
            System.out.println();
            }
    }
}
