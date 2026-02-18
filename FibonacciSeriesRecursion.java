public class FibonacciSeriesRecursion {

    int fibo(int num){

        if(num<=1){
            return num;
        }

        return fibo(num-2)+fibo(num-1);
    }
    
    public static void main(String[] args){
        FibonacciSeriesRecursion obj=new FibonacciSeriesRecursion();
        int ret=obj.fibo(8);
        System.out.println(ret);
    }
}
