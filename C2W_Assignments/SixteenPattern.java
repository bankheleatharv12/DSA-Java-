package C2W_Assignments;

import java.util.Scanner;

public class SixteenPattern {
    
    void m1(int N){

        for(int i=1; i<=N; i++){
            int num=i;
            
            for(int j=1; j<=N; j++){
                if(i%2==0){
                    System.out.println(4*num);
                }else{
                    System.out.println();
                }
            }
           
        }

    }

    public static void main(String[] args){
        SixteenPattern ul=new SixteenPattern();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}
