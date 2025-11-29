package PATTERNS;
import java.util.Scanner;
public class Pattern_14 {
    /*
    A
    A B
    A B C 
    A B C D
    A B C D E

    Simple thing we can declare a char variable and then make it increment 
    second method is using the char variable into the loop and then we can get the output

    */
   public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the n value");
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        char ch ='A';
        for(int j =0;j<=i;j++){
            System.out.print(ch+" ");
            ch+=1;
            
        }
        System.out.println();
    }
   }
    
}
