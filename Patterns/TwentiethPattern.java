package Patterns;
import java.util.*;

public class TwentiethPattern{

    void printN(int N){

        for(int i=0; i<N; i++){
          
            for(int j=0; j<=(N+1)/2; j++){
                System.out.println("*");
                
            }
            
            for(int j=(N+1)/2+1; j<N-i+1;j++){
                System.out.print("*");
            }

            System.out.println();
        }

           
        

    }

        
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of N: ");

        int N=sc.nextInt();

        TwentiethPattern sp=new TwentiethPattern();

        sp.printN(N);
    }
}


