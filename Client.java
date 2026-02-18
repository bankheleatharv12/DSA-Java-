import java.util.*;
import java.util.Stack;


class ReverseString{

    String revString(String str){

        char stackArr[]=new char[str.length()];

        Stack<Character> s=new Stack<Character>();

        for(int i=0; i<str.length(); i++){
            s.push(str.charAt(i));
        }
        int i=0;
        while(!s.empty()){
            stackArr[i]=s.pop();
            i++;
        }
        return new String(stackArr);
     
    
}
}

public class Client{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string to reverse: ");
        String str=sc.next();

        ReverseString obj=new ReverseString();
        String rev=obj.revString(str);

        System.out.println(rev);
    }
}