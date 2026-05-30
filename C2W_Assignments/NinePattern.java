package C2W_Assignments;

import java.util.Scanner;

public class NinePattern {
    
    void m1(int N){

        int num=1;
        for(int i=0; i<N; i++){
           
            for(int j=0; j<N; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
            num=num-(N-1);
        }

    }

    public static void main(String[] args){
        NinePattern ul=new NinePattern ();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}