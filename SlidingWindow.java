public class SlidingWindow {
    public static void main(String[] args){
        int [] arr=new int[] {-3,4,-2,5,3,-2,8,1,4};
        int k=4;
        int sum=0;
        int start=0;
        int end=k-1;

        for(int i=start; i<=end; i++){
            sum=sum+arr[i];
        }

        start=1;
        end=k;
        int max_sum=sum;

        while(end<arr.length){

            if(sum>max_sum){
                max_sum=sum;
            }

            sum=sum-arr[start-1]+arr[end];

            start++;
            end++;

        }
        System.out.println(max_sum);
        
    }
    
}
