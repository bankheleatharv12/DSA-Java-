package Patterns;
import java.util.*;

public class primeNumbers {

    void printN(int N){


        int num=1;

        for(int i=1; i<=N; i++){



            for(int j=0; j<4; j++){

                if(i%num!=0){
                    System.out.print(num);
                    num++;
                    j++;
            
                } 
            }
            System.out.println();
            num=2;
            
            }
            
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N: ");
        int N=sc.nextInt();
        primeNumbers sp=new primeNumbers();
        sp.printN(N);
    }
    
}  
