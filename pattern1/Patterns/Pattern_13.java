package PATTERNS;
import java.util.Scanner;
public class Pattern_13 {
    /*
    1 
    2  3 
    4  5  6 
    7  8  9 10
   11 12 13 14 

   This pattern is very simple usual concept only we need to play with the print
   simple one we can declare the variable and then make a increment of the variable after the print
     */
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int N = sc.nextInt();
        find1(N);
    }
    static void find1(int N ){
        int num=1;
        for(int i=0;i<N;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
            }
    }
}
