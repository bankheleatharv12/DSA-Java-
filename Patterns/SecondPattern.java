package Patterns;
import java.util.*;

public class SecondPattern {

    void printN(int N){
        for(int i=0; i<N; i++){

            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N=sc.nextInt();
        SecondPattern sp=new SecondPattern();
        sp.printN(N);
    }
    
}  
