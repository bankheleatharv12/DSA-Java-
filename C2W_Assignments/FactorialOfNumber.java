import java.util.Scanner;

public class FactorialOfNumber{
    
    void m1(int start, int end){

    for(int i=start; i<=end; i++){
        int num=i;
        int fact=1;
        int sum=0;
        while(i>0){
        int digit=i%10;
    
        for(int j=digit; j<=1; j--){
            fact=fact*i;
        }
        num=num/10;
        sum=sum+fact;
        }

        if(sum==num){
            System.out.print("i");
        }
    }
}

    public static void main(String[] args){
            FactorialOfNumber ul=new FactorialOfNumber();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the start of range:");
        int start=sc.nextInt();
        System.out.print("Enter the start of range:");
        int end=sc.nextInt();
        ul.m1(start, end);
    }
}



