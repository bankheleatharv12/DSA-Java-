package C2W_Assignments;

import java.util.Scanner;

public class TenPattern {
    
    void m1(int N){

        int inc=N;
        for(int i=0; i<N; i++){
            int num=N-i;
            for(int j=0; j<N; j++){
                System.out.print(num+" ");
                num=num+inc;
            }
            System.out.println();
           
        }

    }

    public static void main(String[] args){
        TenPattern ul=new TenPattern ();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}
