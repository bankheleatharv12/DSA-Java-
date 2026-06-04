package C2W_Assignments;

import java.util.Scanner;

public class TwentyThreePattern {
    
    void m1(int N){

    int num = 1;

    for(int i = 0; i <N; i++){

        char ch='A';
        for(int space = 0; space <N-i-1; space++){
            System.out.print( "  ");
        }

        for(int j = 0; j <2*i+1; j++){

            if(i%2==0){
                System.out.print(Character.toUpperCase(ch)+" ");
                ch++;
            }
            else if(i%2!=0){
                System.out.print(Character.toLowerCase(ch)+" ");
                ch++;
            }
            
        }

        System.out.println();
    }
}

    public static void main(String[] args){
        TwentyThreePattern ul=new TwentyThreePattern();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}
