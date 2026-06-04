package C2W_Assignments;

import java.util.Scanner;

public class TwentySixPattern {
    
    void m1(int N){

    for(int i = 0; i <2*N-1; i++){

        
        if(i<N){

            for(int space = 0; space<N-i-1; space++){
                System.out.print( "  ");
            }

            for(int j=0; j<2*i+1; j++){
                System.out.print("*"+" ");
            }

            for(int space = 0; space<N-i-1; space++){
            System.out.print( "  ");
        }

        }
        
        else if(i>=N){

            for(int space = 0; space<i-N+1; space++){
            System.out.print( "  ");
            }

            for(int j=0; j<(2*(2*N-i)-3); j++){
                System.out.print("*"+" ");
            }

            for(int space = 0; space<i-N+1; space++){
            System.out.print( "  ");
            }
        }

        System.out.println();
    }
}

    public static void main(String[] args){
        TwentySixPattern ul=new TwentySixPattern();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}

