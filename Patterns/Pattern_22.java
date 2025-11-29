package PATTERNS;
import java.util.Scanner;
public class Pattern_22 {
    /*
    4 4 4 4 4 4 4
    4 3 3 3 3 3 4 
    4 3 3 3 3 3 4
    4 3 3 3 3 3 4
    4 3 3 3 3 3 4
    4 3 3 3 3 3 4
    4 4 4 4 4 4 4

    for this pattern we can easily says we need to use the both loops and then we can sepearte with the printing matters
    coditon for printing for is if (i==0 || i==n-1|| j==0;||j==n-1;)     --->  this will print the value 4
    condition for printing 3 is else case will print the remainging
    lets give a try
    */
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("4 ");
                }else{
                    System.out.print("3 ");
                }
            }
            System.out.println();
        }
    }
}
