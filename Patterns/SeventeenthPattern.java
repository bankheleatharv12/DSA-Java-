package Patterns;
import java.util.*;

public class SeventeenthPattern {

    void printN(int N){

        for(int i=0; i<N; i++){

            char ch='A';
            for(int j=0; j<N-i-1; j++){
                System.out.print(" ");
            }

            int checkpoint=(2*i+1)/2;

            for(int j=0; j<2*i+1;j++){
                if(j<=checkpoint){
                    System.out.print(ch++);
                }else{
                    System.out.print(ch--);
                }
            }

            for(int j=0; j<N-i-1; j++){
                System.out.print(" ");
            }


            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of N: ");

        int N=sc.nextInt();

        SeventeenthPattern sp=new SeventeenthPattern();

        sp.printN(N);
    }
}


