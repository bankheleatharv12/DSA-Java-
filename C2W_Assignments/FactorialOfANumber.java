package C2W_Assignments;

import java.util.Scanner;

public class  FactorialOfANumber{
    
    void m1(int N){

    int calc=1;

    for(int i =1; i<N; i++){

        if(N==0 || N==1){
            System.out.print("A Factorial of "+N+" is 1.");
        }else if(N<0){
            System.out.println("Please enter positive numbers only");
        }else{
           calc=i*calc;
        }
    }
    System.out.println("A factorial of "+N+" is "+calc);
    
    }


    public static void main(String[] args){
        FactorialOfANumber ul=new FactorialOfANumber();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to find it's factorial:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}



