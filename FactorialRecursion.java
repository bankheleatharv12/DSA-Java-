public class FactorialRecursion {

    int factorial(int num){

        if(num==0){
            return 1;
        }

        return num*factorial(num-1);
    }

    public static void main(String[] args){
        FactorialRecursion obj=new FactorialRecursion();
        int ret=obj.factorial(5);
        System.out.println(ret);
    }    
}
