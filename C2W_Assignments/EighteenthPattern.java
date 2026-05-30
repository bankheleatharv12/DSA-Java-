package C2W_Assignments;

import java.util.Scanner;

public class EighteenthPattern {
    
    void m1(int N){

        
        
        for(int i=1; i<=N; i++){
             
             char ch='A';
             if(i%2==0){
             }
            for(int j=1; j<=N; j++){
                if(j%2==0){
                    if(i%2==0){
                        int num=N-1;
                        System.out.println(num+" ");
                        num-=2;
                    }else{
                        int num=N-2;
                        System.out.println(num+" ");
                        num-=2;
                    }
                    
                }else{

                    if(i%2==0){
                        ch=(char)(ch+N-1);
                        System.out.print(ch+" ");
                        ch-=2;
                    }else{

                        System.out.print(ch+" ");
                        ch+=2;
                    }
                    
                }
            }
         
            System.out.println();
        }

    }

    public static void main(String[] args){
        EighteenthPattern ul=new EighteenthPattern();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}