import java.util.Scanner;

public class StarsDiamond{
    
    void m1(int N){

    for(int i=0; i<=2*N-1; i++){

        int spaces;
        int stars;

        if(i<N){
            spaces=N-i-1;
            stars=2*i+1;
            for (int j=0; j<=spaces;j++){
                System.out.print("  ");
            }

            for(int j=0; j<stars; j++){
                System.out.print("*"+" ");
            }
        }

        else{
            spaces=i-N+1;
            stars=2*(2*N-i)-3;
            for (int j=0; j<=spaces; j++){
                System.out.print("  ");
            }

            for(int j=0; j<stars; j++){
                System.out.print("*"+" ");
            }
        }

        System.out.println();
}

    }

    public static void main(String[] args){
        StarsDiamond ul=new StarsDiamond();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the start of range:");
        int N=sc.nextInt();
        ul.m1(N);
    }
}



