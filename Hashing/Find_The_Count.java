package Hashing;
import java.util.Scanner;
public class Find_The_Count {
    // here we are going to introduce the hashing and then it will helps to find the result very fast and then the time complexity is also reduced
    //so we need to find the array values and stored the hash value and then check the number is present in that hash or not
    //if it is not present it will count by 1 and if it is present and increase the key value into +1
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        int []hash=new int[13];
        //prefetching the datas from the array
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]+=1;
        }
        int q=5;
        while(q--!=0){
            System.out.println("enter the queriies number");
           int number=sc.nextInt();
           System.out.println(hash[number]);
        }

     }
    }