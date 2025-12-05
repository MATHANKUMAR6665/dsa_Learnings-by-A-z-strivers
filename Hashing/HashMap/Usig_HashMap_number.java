package Hashing;
import java.util.HashMap;
import java.util.Scanner;
public class Usig_HashMap_number {
    /*
    Here we are going to use the hashmap for this and then we are save the unnecessary space that held by the array if
    it doesnt take any value and then it will store the direct value if the value is present in the map it will show the 
    output otherwise it will show the output as 0 this is the concept
    step 1 :
            pre storing the data means that it will store the data from the array and stored into the hashmp.
    step 2 :
            now get the value that in the array is present in the hashmap or not 
            if it is not include the value or if the value is already present means we need to increment the value thats the logic
             */
            public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the value of N ");
                int N=sc.nextInt();
                int []arr=new int[N];
                for(int i=0;i<N;i++){
                    arr[i]=sc.nextInt();
                }
                HashMap<Integer,Integer>hp=new HashMap<>();
                for(int i=0;i<N;i++){
                int key =arr[i];
                int frequency=0;
                if(hp.containsKey(key)){
                    frequency=hp.get(key);
                    frequency++;
                    hp.put(key, frequency);
                }else{
                    hp.put(key, 1);
                }
            }
                int q;
                System.out.println("Enter the q value");
                 q=sc.nextInt();
                while(q--!=0){
                    System.out.println("Enter the numbers");
                    int number=sc.nextInt();
                    if(hp.containsKey(number)){
                        System.out.println(hp.get(number));
                    }else{
                        System.out.println(0);
                    }
                }
            
        }
}
