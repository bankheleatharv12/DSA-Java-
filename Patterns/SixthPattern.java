package Patterns;
import java.util.*;

public class SixthPattern {

    void printN(int N){

    
        for(int i=1; i<=N; i++){

            for(int j=1; j<=N-i-1; j++){

                System.out.print(" ");
            }

            for(int j=0; j<2*i-1; j++){

                System.out.print("*");
            }

            for(int j=1; j<=N-i-1; j++){

                System.out.print(" ");
            }


            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N=sc.nextInt();
        SixthPattern sp=new SixthPattern();
        sp.printN(N);
    }
    
} 
