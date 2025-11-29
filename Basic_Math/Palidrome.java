import java.util.Scanner;
public class Palidrome {
    // palidrome number is that the original number is equal to the reverse of that number 
    //that is palidrome so we are going to code for that 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();
        int original=num;
        int reverse=0;
        while(num>0){
            int remainder =num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
        if(original==reverse){
            System.out.println(original+" is palidrome ");
        }else{
            System.out.println( original+" is not a palidrome");
        }
    }
}
