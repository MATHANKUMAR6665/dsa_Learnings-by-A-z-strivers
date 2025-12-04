package Hashing;
import java.util.Scanner;
public class Character_Hashing {
    //This will be character hashing we can able to use the ASCII value to found out that value  and stored into the hash array
    //and get the output of the array so if the character contans onlylowercase  r upper casewe need use the array size as 26 cus
    //maximum size of alplabet is 26 so we can use that other wise if it contains all mixed we can able to use the 256 as sze
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string value");
        String s=sc.next();
        int []hash=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        int q;
    q=sc.nextInt();
    while(q--!=0){
        char numbers =sc.next().charAt(0);
        System.out.println(hash[numbers-'a']);
    }
    }
}
