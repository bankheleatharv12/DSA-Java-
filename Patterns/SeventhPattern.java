package Patterns;
import java.util.*;

public class SeventhPattern {

    void printN(int N){

    
        for(int i=0; i<N; i++){

            for(int j=0; j<=i; j++){

                System.out.print(" ");
            }

            for(int j=0; j<=2*N-2*i-1; j++){

                System.out.print("*");
            }

            for(int j=0; j<=i; j++){

                System.out.print(" ");
            }


            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N=sc.nextInt();
        SeventhPattern sp=new SeventhPattern();
        sp.printN(N);
    }
    
} 
