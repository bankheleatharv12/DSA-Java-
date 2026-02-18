import java.util.*;
public class ArrayInput {

    static void printArr(int arr[]){

        for(int i=0; i<arr.length; i++){
            arr[i]=arr[i]+5;
        }

    }

    public static void main(String[] args){
        int arr[]=new int[7];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        printArr(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

    }
    
}
