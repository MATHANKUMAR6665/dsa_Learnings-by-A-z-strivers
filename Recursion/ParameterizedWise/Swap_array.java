package Recursion.ParameterizedWise;
import java.util.Scanner;
public class Swap_array {
    //In this we can able toswap the array using the parameterized ways and then we can able to pretented that used
    /*
    Procedure :
    first we need to write the method that it need to take the parameters but it dont need to return the values
    here we are going to call the function multiple number of times 
    we need to fapply the swap  function and then we are going the set the two pointers and the we need to make the swap of the 
    two pointers front and back according to the condeition and then we are going to call that multiple times and then we can et the output */
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n =sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the "+n+" number of values for array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        find(0, n-1, arr);
         for(int r:arr){
            System.out.print(r+" ");
        }
    }
    static void find(int i,int j,int []arr){
        if(i==j){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        find(i+1,j-1,arr);
       
    }
    
}
