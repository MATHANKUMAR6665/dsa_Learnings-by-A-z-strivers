package PATTERNS;
import java.util.Scanner;
public class Pattern_9 {
    /*
          *
        * * *
      * * * * *
      * * * * *
        * * *
          *
          
    THis is the combination of pattern 7  & 8 so we need to combine that both 
     */
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the n values");
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2 * i +1;j++){
                System.out.print("*");
            }
             for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2 *N- (2 *i +1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
