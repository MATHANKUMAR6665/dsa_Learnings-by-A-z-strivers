import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class PrintAll_Divisons {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=sc.nextInt();
        method1(n);
        method2(n);
    }
    static void method1(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.err.println();
    }
    static void method2(int n){
        ArrayList <Integer> ans =new ArrayList<>();
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                ans.add(i);
            }
            if(n%i!=i){
                ans.add(n/i);
            }
            
        }
        Collections.sort(ans);
        System.out.println(ans);
    }
}
