package C2W_Assignments;

import java.util.Scanner;

public class TwentyTwoPattern {
    
    void m1(int N){

    int num = 1;

    for(int i = 0; i < N; i++){

        for(int space = 0; space < N-i-1; space++){
            System.out.printf("%4s", "");
        }

        for(int j = 0; j < 2*i+1; j++){
            System.out.printf("%4d", num++);
        }

        System.out.println();
    }
}

    public static void main(String[] args){
        TwentyTwoPattern ul=new TwentyTwoPattern();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}

