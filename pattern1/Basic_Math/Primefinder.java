import java.util.Scanner;
public class Primefinder {
    /* Here we are going to find the prime factor what it mean it contains the two factors either 1 or that number is called prime factor
    so for this approach we can able to find that it can be solve by two methods
    1. we need to find the divisiors and then we need to count the divisiors and then if the count will be 2 we tell its a prime
    otherwise its not  and  TC will be O(N); it run till entire loop.
    2.  In this method everything is same but here we are going to use the sqqrt method and then the TC will be sqrt(N); so the 
    Tc will be changed and then it will work fast */
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        System.out.println(find2(n));
        
    }
    static boolean find1(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
           
        }
       return count==2;
    }
    // this is the sqrt method we need to use this for better things and the better time complexity
    static boolean find2(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i*i==n){
                    count++;
                }else{
                count+=2;
            }
        }
        }
        return count==2;
    }
}
