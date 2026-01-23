public class FibonacciSeriesRecursion {

    int fibo(int num){

        if(num<=1){
            return num;
        }

        return fibo(num-1)+fibo(num-2);
    }
    
    public static void main(String[] args){
        FibonacciSeriesRecursion obj=new FibonacciSeriesRecursion();
        int ret=obj.fibo(8);
        System.out.println(ret);
    }
}
