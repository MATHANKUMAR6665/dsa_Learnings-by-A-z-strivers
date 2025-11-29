import java.util.Scanner;
public class Amstrong_numbers {
    /*
    amstrong number is that if have any number and that number we need to expand into single digits
    and then we need to apply the cube to the each digit and then we need to add those cube
    values and then we need to check the sum value with the original value and then check 
    whether match or not if it is match it is amstrong number of else not  */
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        while(num>0){
            int remainder=num%10;
            sum+=remainder*remainder*remainder;
            num=num/10;
        }
        if(original==sum){
            System.out.println("this is amstrong number");
        }else{
            System.out.println("this is not an amstrong number");
        }
    }
}
