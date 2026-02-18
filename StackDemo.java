import java.util.Stack;

public class StackDemo{

    public static void main(String [] args){
        Stack<Integer> s = new Stack<Integer>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s);
        System.out.println(s.pop());
    }
    
} 

/*import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s);      // [10, 20, 30, 40]
        System.out.println(s.pop()); // 40
        System.out.println(s);      // [10, 20, 30]
    }
}*/
