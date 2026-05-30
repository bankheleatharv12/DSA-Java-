package C2W_Assignments;

import java.util.Scanner;

public class FirstPattern {
    
    void m1(int N){

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print("$");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
         FirstPattern ul=new  FirstPattern();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}
