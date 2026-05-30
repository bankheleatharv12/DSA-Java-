package C2W_Assignments;

import java.util.Scanner;

public class EightPattern {
    
    void m1(int N){

       
        for(int i=1; i<N; i++){
             char ch=(char)('a' +(N-1));
            for(int j=0; j<N; j++){
                System.out.print(ch+" ");
                ch--;;
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        EightPattern ul=new EightPattern ();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}
