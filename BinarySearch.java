import java.util.*;
public class BinarySearch {
    
    static int Binary(int arr[], int k){

        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]<k){
                start=mid+1;
            }
            if(arr[mid]>k){
                end=mid-1;
            }
        }
        return -1;
        
    
    }
    
    
    public static void main(String[] args){

        int arr[]=new int[]{22,11,43,5,63,42,0,76};
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the key to search: ");
        int k=sc.nextInt();
        int index=Binary(arr, k);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index:"+index);
        }



        
    }
    
}

