class MatrixRotation {
    public static void main(String[] args){
        int arr[][]=new int[][]{{1,2,3},{5,6,7},{9,10,11}};
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0; i<arr.length; i++){
            int start=0;
            int end=arr.length-1;

            while(start<end){
                int temp=arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]=temp;

                start++;
                end--;
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}