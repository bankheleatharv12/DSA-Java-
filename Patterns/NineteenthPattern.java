package Patterns;
import java.util.*;

public class NineteenthPattern{

    void printN(int N){

        for(int i=0; i<N/2; i++){
          
            for(int j=0; j<(N-i)/2; j++){
                System.out.print("*");
            }
            
            for(int j=0; j<2*(i);j++){
                System.out.print(" ");
            }

            for(int j=0; j<(N-i)/2; j++){
                System.out.print("*");
            }
            System.out.println();
        }

           
        for(int i=(N/2); i<=N; i++){

            for(int j=1; j<=N-2*i+1 ; j++){
                System.out.print("*");
            }

            for(int j=1; j<=(N-2*i) ; j++){
                 System.out.print(" ");
            }

            for(int j=1; j<=N-2*i+1 ; j++){
                System.out.print("*");
            }
             System.out.println();
        }

    }

        
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of N: ");

        int N=sc.nextInt();

        NineteenthPattern  sp=new NineteenthPattern ();

        sp.printN(N);
    }
}




