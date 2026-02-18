public class Print2DMatrix {
    public static void main(String[] args){
        int arr[][]=new int [][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        for(int j=0; j<arr.length; j++){
            for(int i=0; i<arr[j].length; i++){
                System.out.print(arr[j][i]+",");
            }
            System.out.println();
        }
    }
    
}
