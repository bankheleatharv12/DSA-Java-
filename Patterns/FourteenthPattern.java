package Patterns;
import java.util.*;

public class FourteenthPattern {

    void printN(int N){

        for(int i=0; i<N; i++){
         
            for(char ch='A'; ch<='A'+(N-i-1); ch++){
                System.out.print(ch+" ");
            
            }
            System.out.println();

    }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of N: ");

        int N=sc.nextInt();

        FourteenthPattern sp=new FourteenthPattern();

        sp.printN(N);
    }
}

