package Patterns;
import java.util.*;

public class SixteenthPattern {

    void printN(int N){

       char ch='A';

        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ch+" ");
            
            }
            ch++;
            System.out.println();

    }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of N: ");

        int N=sc.nextInt();

        SixteenthPattern sp=new SixteenthPattern();

        sp.printN(N);
    }
}


