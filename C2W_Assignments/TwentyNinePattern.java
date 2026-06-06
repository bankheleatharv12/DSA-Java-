import java.util.Scanner;

public class TwentyNinePattern {

    void m1(int N){

        int num=1;
        char ch='A';
        for(int i = 0; i < N; i++){

            for(int space=0; space<=N-i-1; space++){
                System.out.print("  ");
            }

            for(int j=0; j<=i+1; j++){
                if(i%2==0){
                    System.out.print(num+" ");
                }else{
                    System.out.print(ch+" ");
                }
            }
            num++;
            ch++;
            System.out.println();
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");

        int N = sc.nextInt();

        TwentyNinePattern obj = new TwentyNinePattern();

        obj.m1(N);
    }
}