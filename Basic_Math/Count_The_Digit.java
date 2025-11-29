import java.util.Scanner;
public class Count_The_Digit{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value");
        int N =sc.nextInt();
        int remainder =0;
        int count =0;   
        while(N>0){
            remainder =N%10;
            count++;
           
            N=N/10;

        }
        System.out.println(count);
        
    }
}
