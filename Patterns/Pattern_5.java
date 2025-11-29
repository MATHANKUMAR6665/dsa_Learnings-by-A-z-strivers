package PATTERNS;
import java.util.Scanner;
public class Pattern_5 {
    /*
    * * * * * 
    * * * *
    * * *
    * *
    * 
    
    //Thiss is the pattern so we need to analyse that row and coloum wise 
    first row = 5 starts
    second row =4 stars
    third row = 3 stars
    fourth row = 2 starts
    fifth row = 1 star

    so the formula is n -i;
    */
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the value of n");
        int N =sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
