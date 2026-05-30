package C2W_Assignments;

import java.util.Scanner;

public class SecondPattern {
    
    void m1(int N){

        for(int i=1; i<N; i++){
            for(int j=1; j<N; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        SecondPattern ul=new  SecondPattern();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}
