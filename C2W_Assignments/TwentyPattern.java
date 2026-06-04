package C2W_Assignments;

import java.util.Scanner;

public class TwentyPattern {
    
    void m1(int N){

        for(int i=0; i<=N; i++){

            for(int j=0; j<=i; j++){
                System.out.print("  ");
            }

            for(char ch=(char)('A'+ (N-1)); ch>=(char)('A'+i); ch--){
                System.out.print(ch+" ");
            }

            System.out.println();
        }

    }

    public static void main(String[] args){
        TwentyPattern ul=new TwentyPattern();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}