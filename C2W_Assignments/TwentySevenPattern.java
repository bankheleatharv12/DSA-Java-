package C2W_Assignments;

import java.util.Scanner;

public class TwentySevenPattern {
    
    void m1(int N){

    int num=1;
    char ch='A';
    for(int i = 0; i <N; i++){
        
        for(int j=0; j<=i; j++){

            if(j%2==0){
                System.out.print((num-j)+" ");
            }else{
                System.out.print((char)(ch-j)+" ");
            }

        }
        num++;
        ch++;

    System.out.println();
    }
}

    public static void main(String[] args){
        TwentySevenPattern ul=new TwentySevenPattern();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}

