package PATTERNS;
import java.util.Scanner;
public class Pattern_8 {
    /*
    * * * * * * * 
      * * * * *
        * * *
          *
          
    for this pattern we ned to analyze that what it suits that its like the same pattern that we have 

    previously but its an inverse of that patterns 
    star,space ,star
    0th row   -->     0     7     0
    ist row   -->     1     5     1
    2nd row   -->     2     3     2
    3rd row   -->     3     1     3 

    there are many loops are there 
    outer loop --> for the rows 
    inner loop --> for the space 
    inner loop --> for the star
    inner loop --> for the space again

    formula for space j<=i;
    formula for star = 2 *n - 2 * i +1;

    */
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2 * n-(2 *i +1);j++){
                System.out.print("*");
            }
              for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
