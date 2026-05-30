package Patterns;
import java.util.*;

public class TwentyTwoPattern{

    void printN(int N){

        for(int i=0; i<2*N-1; i++){
          
            for(int j=0; j<2*N-1; j++){
            
            int top=i;
            int left=j;
            int right=(2*N-2)-j;
            int down=(2*N-2)-i;

            int minValue = Math.min(Math.min(top, down),Math.min(left, right));

            System.out.print(N - minValue + " ");

            
        }
        System.out.println();

    }
}

        
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of N: ");

        int N=sc.nextInt();

        TwentyTwoPattern sp=new TwentyTwoPattern();

        sp.printN(N);
    }
}
