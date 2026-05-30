package C2W_Assignments;

import java.util.Scanner;

public class ThirdPattern {
    
    void m1(int N){

        for(int i=1; i<=N; i++){
            int num=1;
            for(int j=1; j<=N; j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        ThirdPattern ul=new ThirdPattern ();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}

