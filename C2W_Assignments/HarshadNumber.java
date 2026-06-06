
import java.util.Scanner;

public class HarshadNumber {
    
    void m1(int start, int end ){

    
    for(int i = start; i<=end; i++){
        int count=i%10;
        int num=i/10;

            while(num>0){
                count=count+num%10;
                num=num/10;
            }
            if(i%count==0){
                System.out.print(i +" ");
            }
    }

    }

    public static void main(String[] args){
        HarshadNumber  ul=new HarshadNumber ();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the start of range:");
        int start=sc.nextInt();
        System.out.print("Enter the end of range:");
        int end =sc.nextInt();
        ul.m1(start, end);
    }
}


