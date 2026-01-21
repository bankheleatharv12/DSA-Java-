class MaxSumSubarray{
    public static void main(String[] args){
        int arr[]=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int psArr[]=new int[arr.length];
        psArr[0]=arr[0];
        int max_sum=Integer.MIN_VALUE;


        for(int i=1; i<arr.length; i++){
            psArr[i]=psArr[i-1]+ arr[i];
        }

        for(int j=0; j<arr.length; j++){
            int sum=0;

            for(int k=j; k<arr.length; k++){

                if(j==0){
                    sum=psArr[j];
                }

                else{
                    sum=psArr[k]-psArr[j-1];
                }

                if(sum>max_sum){
                    max_sum=sum;
                }

            }
            
        }
        System.out.println(max_sum);
    
}
}
