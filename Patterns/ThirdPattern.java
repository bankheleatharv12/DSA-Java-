package Patterns;
import java.util.*;

public class ThirdPattern {

    void printN(int N){

    
        for(int i=1; i<=N; i++){

            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
            
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N=sc.nextInt();
        ThirdPattern sp=new ThirdPattern();
        sp.printN(N);
    }
    
} 
