package Hashing;
import java.util.HashMap;
import java.util.Scanner;
public class Using_HashMap_Char {
    //simply we are using the hash for the character and then the key is char and then the increment /frequency is integer so that we can use that
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.next();
        HashMap<Character,Integer>hp=new HashMap<>();
        int frequency;
        for(int i=0;i<s.length();i++){
            if(hp.containsKey(s.charAt(i))){
                frequency=hp.get(s.charAt(i));
                frequency++;
                hp.put(s.charAt(i), frequency);
            }else{
                hp.put(s.charAt(i), 1);
            }
        }
        System.out.println("enter the q value");
        int q=sc.nextInt();
        while(q--!=0){
            System.out.println("enter the queries");
            char ch=sc.next().charAt(0);
            if(hp.containsKey(ch)){
                System.out.println(hp.get(ch));
            }else{
                System.out.println(0);
            }
        }

    }
    
}
