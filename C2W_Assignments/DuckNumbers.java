import java.util.Scanner;

public class DuckNumbers{
    
    void m1(int N){

    boolean flag=false;

    while(N>0){
        if(N%10==0){
            flag=true;
        }
        N=N/10;
    }

    if(flag==true){
        System.out.print("It is a duck number");
    }
    else{
        System.out.print("It isnot a duck number");
    }

    }

    public static void main(String[] args){
        DuckNumbers ul=new DuckNumbers();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the start of range:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}



