class PrefixSumSubArray{
    public static void main(String[] args){
        int arr[]=new int[]{2,4,1,3};
        int prefixSum[]=new int [arr.length];

        prefixSum[0]=arr[0];

        for(int i=1; i<arr.length; i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                if(i==0){
                    sum=prefixSum[j];
                }

                else{
                    sum=prefixSum[j]-arr[i-1];

                }

                System.out.println(sum);
            }
        }
    }
}
