package Patterns;
import java.util.*;

public class FirstPattern {

    void printN(int N){
        for(int i=0; i<N; i++){

            for(int j=0; j<N; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N=sc.nextInt();
        FirstPattern fp=new FirstPattern();
        fp.printN(N);
    }
    
}
