package PATTERNS;
import java.util.Scanner;
public class Pattern_21 {
    /*
    * * * * * 
    *       *
    *       *
    * * * * *
    
    this is the pattern so we need to analyze this and it will print the circle and the we are going to print according to that 
    condion to print the start i=0;|| i=n-1;||j=0; j=n-1;
    these are the conditon to print 
    lets give a try*/
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the n value");
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
