package Recursion;

public class Multiple_calls {
    //this will be used for the multiple calls in single function calls and then it will print
    //here we are going to use the recursive tree to find the process and then find the flow of the program
    public static void main(String[]args){
        System.out.println(fact(7));
    }
    static int fact(int n){
        if(n<=1){
            return n;
        }
        int flast =fact(n-1);
        int slast=fact(n-2);
        return flast+slast;
    }
    
}
