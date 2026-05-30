package C2W_Assignments;

import java.util.Scanner;

public class OddNumbersCount {
    
    void m1(int N){

        int count=0;

        for(int i=1; i<=N; i++){

            if(i%2!=0){
                count++;
            }
        }

        System.out.println("The count of odd numbers in first "+ N + " numbers is:"+count);

    }

    public static void main(String[] args){
        OddNumbersCount ul=new OddNumbersCount();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first N numbers to calculate the count:");
        int N=sc.nextInt();
        ul.m1(N);
        
    }

}
