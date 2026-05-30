package C2W_Assignments;

import java.util.Scanner;

public class SixthPattern {
    
    void m1(int N){

        
        for(int i=1; i<=N; i++){
            char ch='A';
            for(int j=1; j<=N; j++){
                System.out.print(j+""+ch+" ");
                ch++;
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        SixthPattern ul=new SixthPattern ();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}
