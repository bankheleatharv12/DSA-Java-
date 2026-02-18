import java.util.*;
import java.util.Stack;

class Demo{

    boolean parenthesisChecker(String str){
        Stack<Character> s=new Stack<Character>();

        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                
                s.push(ch);


            }else{
                if(!s.empty()){

                    char x=(char)s.peek();

                    if((x=='[' && ch==']') || (x=='{' && ch=='}') || (x=='(' && ch==')')){
                        s.pop();
                    }else{
                        return false;
                    }
                }

                else{
                    return false;
                }
            }
        }
    
    if(s.empty()){
        return true;
    }else{
        return false;
    }

}
}

public class ParenthesisChecker {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter expression");
        String str=sc.next();

        Demo obj=new Demo();
        boolean ret=obj.parenthesisChecker(str);

        if(ret){
            System.out.println("Balanced");
        }else{
            System.out.println("Not balanced");
        }
    }
}
