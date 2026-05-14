package Patterns;
import java.util.*;

public class FifteenthPattern {

    void printN(int N){

        for(int i=0; i<N; i++){
            
            char ch=(char)('A'+i);

            for(int j=0;j<=i; j++){
                System.out.print(ch+" ");
            }
            System.out.println();

    }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of N: ");

        int N=sc.nextInt();

        FifteenthPattern sp=new FifteenthPattern();

        sp.printN(N);
    }
}
