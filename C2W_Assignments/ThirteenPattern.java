package C2W_Assignments;

import java.util.Scanner;

public class ThirteenPattern {
    
    void m1(int N){

        int num1=1;
        int num2=2;
        for(int i=1; i<=N; i++){
            
            for(int j=1; j<=N; j++){
                
                if(j%2==0){
                    System.out.print(num2+" ");
                    num2=num2+2;
                }else {
                    System.out.print(num1*num1+" ");
                    num1=num1+2;
                }
            }
            System.out.println();
           
        }

    }

    public static void main(String[] args){
        ThirteenPattern ul=new ThirteenPattern ();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}