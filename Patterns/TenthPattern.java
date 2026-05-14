package Patterns;
import java.util.*;

public class TenthPattern {

    void printN(int N){

        for(int i=1; i<=N; i++){

            for(int j=1; j<=i; j++){
                
                if((int) (i+j) % 2 == 0){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of N: ");

        int N=sc.nextInt();

        TenthPattern sp=new TenthPattern();

        sp.printN(N);
    }
}
