package PATTERNS;
import java.util.Scanner;
public class Pattern_19 {
    /*
    * * * * * * * * * * 
    * * * *     * * * * 
    * * *         * * * 
    * *             * * 
    *                 *
    *                 *
    * *             * *
    * * *         * * * 
    * * * *     * * * *
    * * * * * * * * * *
    
    we need to analyze this pattern its a combination of two pattens so brek out into two pattens
    first half is that star , space , star
    formula for star is n-i;
    formula for space is initallly zero and then we need to add by 2 for the spaces  
    this is the first half of break out 

    and then the second half is that easy one and that is the inverse of the above one so we need to think according to that 
    stars ,space,star 
    formula for star is j<==i;
    formula for space is that 2*n -1;

    now we are going to implement that as in above diagram
    */
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows  :");
        int n = sc.nextInt();
        int spaces =0;
        for(int i=0;i<n;i++){
             
            for(int j=0;j<n-i;j++){   // stars  
                System.out.print("*");
            }
           
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
             for(int j=0;j<n-i;j++){   // stars  
                System.out.print("*");
            }
            spaces +=2;
            System.out.println();
        }
        int inispace=spaces-2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<inispace;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            inispace-=2;
            System.out.println();
        }
    }
}
