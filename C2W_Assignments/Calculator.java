package C2W_Assignments;

import java.util.Scanner;

public class Calculator {
    
    void m1(char ch, int num1, int num2){

        switch(ch){

            case '+':{
                int result=num1+num2;
                System.out.println(result);
                break;
            }
        
            case '-':{
                int result=num1-num2;
                System.out.println(result);
                break;
            }

            case '*':{
                int result=num1*num2;
                System.out.println(result);
                break;
            }

            case '/':{

                if(num2==0){
                    System.out.println("Not defined");
                }
                
                else{ 
                int result=num1/num2;
                System.out.println(num1/num2);
                }
                break;
            }

            default:{
                System.out.println("Invalid input");
            }

            }

    }

    public static void main(String[] args){
        Calculator ul=new Calculator();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter second number:");
        int num2=sc.nextInt();
        System.out.print("Enter the Operation(+, -, *, /):");
        char ch=sc.next().charAt(0);
        ul.m1(ch, num1, num2);
        
    }
}
