package Patterns;
import java.util.*;

public class NinthPattern {

    void printN(int N){

        for(int i=1; i<=2*N-1; i++){

            int stars=i;

            if(i>N){
                stars=2*N-i;
            }

            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of N: ");

        int N=sc.nextInt();

        NinthPattern sp=new NinthPattern();

        sp.printN(N);
    }
}
