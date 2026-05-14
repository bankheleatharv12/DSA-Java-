package Patterns;
import java.util.*;

public class EighteenthPattern {

    void printN(int N){

        for(int i=0; i<N; i++){
          
            for(char ch=(char)('E'-i); ch<='E'; ch++){
                System.out.print(ch+" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of N: ");

        int N=sc.nextInt();

        EighteenthPattern sp=new EighteenthPattern();

        sp.printN(N);
    }
}


