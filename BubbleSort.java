public class BubbleSort {
    public static void main(String[] args){
        int arr[]=new int []{2,3,4,5,6,9,7};
        boolean swapped;
        int temp;
        int count=0;
        int itr=0;

        for(int i=0; i<arr.length; i++){
            swapped=false;
            
            for(int j=0; j<arr.length-i-1; j++){

                
                count++;

                if(arr[j]>arr[j+1]){
                    itr++;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
                
            }
            if(swapped==false){
                break;
            }
        }
        System.out.println(count);
        System.out.println(itr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }    
    }
    
}
