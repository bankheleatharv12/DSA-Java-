package C2W_Assignments;

import java.util.Scanner;

public class Divisibleby3or7 {

        void m1(int num){

        if(num%3==0){
            System.out.println("Given Number is divisible by 3");
        }
        
        else if(num%7==0){
            System.out.println("Given number is divisible by 7");
        }

        else if(num%3!=0 && num%7!=0 ){
            System.out.println("Given number is neither divisible by 7 nor 3");
        }

    }

    public static void main(String[] args){
        Divisibleby3or7 ul=new Divisibleby3or7();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        ul.m1(num);
        
    }
}

