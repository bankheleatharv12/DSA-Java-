package Patterns;
import java.util.*;

class EleventhPattern {

    void printN(int N){

        for(int i=1; i<=N; i++){

            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            for(int j=1;j<=2*(N-i);j++){
                System.out.print(" ");
            }

            for(int k=i; k>=1;k--){
                System.out.print(k);
            }

            System.out.println();
    }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of N: ");

        int N=sc.nextInt();

        EleventhPattern sp=new EleventhPattern();

        sp.printN(N);
    }
}