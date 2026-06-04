import java.util.Scanner;

public class PrintDigits {

    void m1(int N){

        while(N > 0){

            int digit = N % 10;

            System.out.print(digit + " ");

            N = N / 10;
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int N = sc.nextInt();

        PrintDigits obj = new PrintDigits();

        obj.m1(N);
    }
}