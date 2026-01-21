import java.util.*;
class KLengthSubArrayPrefixSum {
    public static void main(String[] args){
        int[] arr= new int[] {-3,4,-2,5,3,-2,8,2,1,4};
        int [] psArr= new int[arr.length];
        psArr[0]=arr[0];

        System.out.println("Enter k:");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();

        for(int i=1; i<arr.length; i++){
            psArr[i]=psArr[i-1]+arr[i];
        }

        int start=0;
        int end=k-1;
        int max_sum=Integer.MIN_VALUE;

        int sum=0;


        while(end<arr.length){

           

            if(start==0){
                sum=psArr[end];
            }

            else{
                sum=psArr[end]-psArr[start-1];
            }

            if(sum>max_sum){
                max_sum=sum;
            }

            start++;
            end++;
        }
        System.out.println(sum);


    }
    
}
