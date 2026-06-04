package C2W_Assignments;

import java.util.Scanner;

public class TwentyOnePattern {
    
    void m1(int N){

        int num=1;

        for(int i=0; i<N; i++){

            for(int j=0; j<N-i ; j++){
                System.out.print("  ");
            }

            for(int j=0; j<=i; j++){
                System.out.print("*"+" ");
            }

            for(int j=0; j<i; j++){
                System.out.print("*"+" ");
            }

            for(int j=0; j<N-i ; j++){
                System.out.print("  ");
            }

            System.out.println();

        }

    }

    public static void main(String[] args){
        TwentyOnePattern ul=new TwentyOnePattern();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}
