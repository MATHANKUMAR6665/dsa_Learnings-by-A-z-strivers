import java.util.Scanner;

public class Reverse_a_number {
 public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int N =sc.nextInt();
        int remainder =0;
        int count =0;
        int reverse_number =0;
        while(N>0){
            remainder =N%10;
            count++;
            reverse_number=reverse_number*10 + remainder;
            N=N/10;

        }
        System.out.println(count);
        System.out.println(reverse_number);
    }
    
}
