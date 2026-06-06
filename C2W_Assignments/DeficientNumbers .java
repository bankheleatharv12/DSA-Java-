
import java.util.Scanner;

public class DeficientNumbers {
    
    void m1(int start, int end ){

    
    for(int i = start; i<=end; i++){
        int count=0;
        for(int j=1; j<=i/2; j++){
            
            if(i%j==0 && i!=j){
                count=count+j;
  
            }
        }
        
        if(count==i ){
            System.out.print(i +" ");
        }  
    }

}

    public static void main(String[] args){
        DeficientNumbers  ul=new DeficientNumbers ();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the start of range:");
        int start=sc.nextInt();
        System.out.print("Enter the end of range:");
        int end =sc.nextInt();
        ul.m1(start, end);
    }
}


