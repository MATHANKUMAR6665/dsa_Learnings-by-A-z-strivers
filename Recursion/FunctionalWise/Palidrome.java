package Recursion.FunctionalWise;
import java.util.Scanner;
public class Palidrome {
    // we are going to check the string is palidrome or not using the recursion with functional way and then we are going to call that function 
    //conitniously
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string value");
        String s =sc.next();
        System.out.println(find(0, s.length()-1, s));
    }
    static boolean find( int left ,int right, String s){
      if(left>=right){
        return true;
      } 
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        return find(left+1, right-1, s);
    }
}
