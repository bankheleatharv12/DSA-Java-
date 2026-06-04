package C2W_Assignments;

import java.util.Scanner;

public class DigitsOfANumber {

    void m1(int num){

        String str = String.valueOf(num);
        int N=str.length();
        int arr[]=new int[N];

        for(int i=0; i<N; i++){

            int temp=num;
            int pre=temp%10;
            arr[i] =pre;
            num=num/10;
        }
        System.out.print("The digits are:"+);
    }

    public static void main(String[] args){
        Divisibleby3or7 ul=new Divisibleby3or7();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        ul.m1(num);
        
    }
}
