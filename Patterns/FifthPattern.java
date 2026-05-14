package Patterns;
import java.util.*;

public class FifthPattern {

    void printN(int N){

    
        for(int i=0; i<N; i++){

            for(int j=1; j<=N-i; j++){

                System.out.print(j+" ");
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N=sc.nextInt();
        FifthPattern sp=new FifthPattern();
        sp.printN(N);
    }
    
} 

