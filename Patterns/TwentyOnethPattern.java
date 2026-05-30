package Patterns;
import java.util.*;

public class TwentyOnethPattern{

    void printN(int N){

        for(int i=0; i<N; i++){
          
            for(int j=0; j<N; j++){
                
            if(i==0 || j==0 || i==N-1 || j==N-1){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();

    }
}

        
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of N: ");

        int N=sc.nextInt();

        TwentyOnethPattern sp=new TwentyOnethPattern ();

        sp.printN(N);
    }
}
