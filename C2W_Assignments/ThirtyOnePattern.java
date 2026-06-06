
import java.util.Scanner;

public class ThirtyOnePattern {
    
    void m1(int N){

    char ch='A';
    for(int i = 0; i <N; i++){

        for(int space=0; space<i; space ++){
                System.out.print("  ");
        }
        
        for(int j=0; j<N-i; j++){

            

            if((int)(ch)%2==0){
                System.out.print(Character.toLowerCase(ch)+" ");
                ch++;
            }else{
                System.out.print(Character.toUpperCase(ch)+" ");
                ch++;
            }

        }
        

    System.out.println();
    }
}

    public static void main(String[] args){
        ThirtyOnePattern ul=new ThirtyOnePattern();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}

