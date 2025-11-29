package PATTERNS;
import java.util.Scanner;
public class Pattern_20 {
    /*
    *                 *
    * *             * *
    * * *         * * * 
    * * * *     * * * *
    * * * * * * * * * *
    * * * *     * * * *
    * * *         * * *
    * *             * *
    *                 *

    first we need to analyze this pattern we ca break down into two pattern and the combine the both and then get the output

    */
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int space = (2 *n)-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
             for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            space-=2;
            System.out.println();
        }
        int inispace=2;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<inispace;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            inispace+=2;
            System.out.println();
        }
    }
}
