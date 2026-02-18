import java.util.*;
class KlengthSubarray {
    public static void main(String[] args){

        int arr[]=new int[] {-3,4,-2,5,3,-2,8,2,1,4};
        int max_sum=Integer.MIN_VALUE;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter k:");
        int k=sc.nextInt();

        int start=0;

       
        int end=k-1;

        while(end<arr.length){

            int sum=0;

            for(int i=start; i<=end; i++){
            
                sum=sum+arr[i];
            }

            if(sum>max_sum){
                max_sum=sum;
            }

            start++;
            end++;
            
        }

        System.out.println(max_sum);
    }
    
}

