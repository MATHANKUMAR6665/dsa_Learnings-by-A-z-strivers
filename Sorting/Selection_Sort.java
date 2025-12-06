package Sorting;

public class Selection_Sort {
    /*
    selection sort is the kind of sort first we need to assume the first element in the array is the smallest 
    and then check the remaing element if the remaing eleemnt is small we need to swap with that element  */
    public static void main(String[]args){
        int []arr={5,3,8,4,2};
        selection(arr);
        for(int i :arr){
            System.out.print(i+" ");
        }
    }
    static void selection(int []arr){
        for(int i=0;i<arr.length;i++){
            int minimum=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minimum]){
                    minimum=j;
                }
            }
        
        int temp=arr[minimum];
        arr[minimum]=arr[i];
        arr[i]=temp;
        }
    }
    
}
