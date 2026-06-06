
import java.util.Scanner;

public class ThirtyTwoPattern {
    
    void m1(int N){

      int start=(N-1)*(N*(N+1));
    for(int i = 0; i <N; i++){
      
        for(int space=0; space<i; space ++){
                System.out.printf("%4s","");
        }
        
        for(int j=0; j<N-i; j++){
            
            System.out.printf("%4d",start,"  ");
            start=start-N;

        }
        

    System.out.println();
    }
}

    public static void main(String[] args){
        ThirtyTwoPattern ul=new ThirtyTwoPattern();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}


