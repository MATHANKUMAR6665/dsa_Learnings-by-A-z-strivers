package Recursion;
import java.util.Scanner;
public class Names{
    public static void main(String[]args){
        //printname();
        find1(count);
    }
     static int count=0;
    static void printname(){
        
        if(count<=5){
            
            System.out.println("mathan");
            count++;
            printname();
        }
    }
    //perfect recursion program 
  static void find1(int count){
    if(count>5){
        return;
    }
    System.out.println("maddy");
    count++;
    find1(count);
  }
    
 
}
