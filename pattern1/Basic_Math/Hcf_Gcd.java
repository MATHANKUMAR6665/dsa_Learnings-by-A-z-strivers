import java.util.Scanner;
public class Hcf_Gcd {
    /*
    first we need to find the common factor b/w the two number and the we need to find the greater number for the factor
    
    the most easy method will be euclid method to find the hcf and gcd 
    
    first we need to use the while loop and set the lopp run till the second number goes to 0
    second we need to find the remainder b/w the first number and then second number and then get the remainder 
    now we need to swap the num1=num2 and then num2=remainder 
    if we did like the above condition the num 2 becomes zero in this scenario the num 1 will be greatest common factor so this 
    is the method*/
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two numbers ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(find(num1, num2));
    }
    static int find(int n1,int n2){
        while(n2>0){
            int remainder =n1%n2;
            n1=n2;
            n2=remainder;
        }
        return n1;
    }
}
