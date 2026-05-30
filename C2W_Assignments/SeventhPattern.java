package C2W_Assignments;

import java.util.Scanner;

public class SeventhPattern {
    
    void m1(int N){

        char ch=(char)('A'+(N-1));
        int num=N;
        for(int i=1; i<=N; i++){
            
            for(int j=1; j<=N; j++){
                if(i%2==0){
                    System.out.print(num+" ");
                    
                }else{
                    System.out.print(ch+" ");
                }
            }
            ch--;
            num=num-1;
            System.out.println();
        }

    }

    public static void main(String[] args){
        SeventhPattern ul=new SeventhPattern ();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}