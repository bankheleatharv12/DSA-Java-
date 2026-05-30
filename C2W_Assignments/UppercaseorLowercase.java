package C2W_Assignments;
import java.util.Scanner;
public class UppercaseorLowercase{

    void m1(char ch){

        int ch_num=(int)ch;

        if(65<=ch_num && ch_num<=90){
            System.out.println("Entered character "+ch+ " is uppercase ");
        }

        else if(97<=ch_num && ch_num<=122){
            System.out.println("Entered character "+ch+ " is lowercase ");
        }

        else{
            System.out.println("Invalid input");
        }


    }

    public static void main(String[] args){
        UppercaseorLowercase ul=new UppercaseorLowercase();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character:");
        char ch=sc.next().charAt(0);
        ul.m1(ch);
        
    }
}
