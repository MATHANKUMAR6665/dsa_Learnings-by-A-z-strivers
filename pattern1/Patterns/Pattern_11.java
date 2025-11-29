package PATTERNS;
import java.util.Scanner;
public class Pattern_11 {
    /*
    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1

    we need to analyze the pattern the usual format only but the printing statements are going to vary
    if we look carefully we can able to identify the pattern like even number of rows starts with 1 and then odd numbers starts with o
    and then the numbers are altenative like o and's 1s 

    // so we can able to code these things \

    it need two loops
    */
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n value :");
    int N = sc.nextInt();
    find(N);
}
    static void find(int N ){
        int start =1;
        for(int i=0;i<N;i++){
            if(i%2==0){
                start=1;
            }else{
                start=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
}
