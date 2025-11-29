package PATTERNS;
import java.util.Scanner;
public class Pattern_7 {
    /*
          *
        * * *
      * * * * *
    * * * * * * *
    
    This is the one of the pattern first we need to analyze the pattern 
    here it is in the format of space ,star , space
    there are many loops 
    first loop -- outer loop this is for rows
    second loop -- inner loop this is for spaces 
    third loop -- inner loop this is for stars
    fourth loop -- inner loop this is for again spaces 
    
                      spaces     start      spaces    
    0 th row  -->       3          1          3
    i st row  -->       2          3          2
    2nd row   -->       1          5          1
    3rd row   -->       0          7          0

    formula  for spaces is n-i-1;   --> its in decreasing orders 
    formula for  stars is 2 * i +1;   -->   it is in odd number 
    */
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N =sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2 * i +1;j++){
                System.out.print("*");
            }
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
