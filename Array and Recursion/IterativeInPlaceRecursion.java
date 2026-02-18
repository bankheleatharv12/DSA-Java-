import java.util.*;
class Node{
    int data;
    Node next=null;

    Node(int data){
        this.data=data;
    }
}

class LinkedList{
    Node head=null;

    //addNode
     void addFirst(int data){

        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }

    //printLL
    void printLL(){
    if(head==null){
        System.out.println("Empty linked list");
        return;
    }

    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data);
        if(temp.next!=null) System.out.print("-");
        temp=temp.next;
    }
    System.out.println();
}


    //reverse
    void reverseItr(){

        if (head==null){
            return;
        }

        Node prev= null;
        Node curr=head;
        Node forward=null;

        while(curr!=null){
            forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        head=prev;
    }

}

public class IterativeInPlaceRecursion {

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        Scanner sc=new Scanner(System.in);
        char ch;
        do{
            System.out.println("1.addNode");
            System.out.println("2.printLL");
            System.out.println("3.reverseItr");
            System.out.println("4.reverseRec");
            
            System.out.println("Enter your choice: ");
            int choice= sc.nextInt();

            switch(choice){
                case 1:
                    {
                        System.out.println("enter data: ");
                        int data=sc.nextInt();
                        ll.addFirst(data);
                    }
                    break;
                case 2:
                    {
                        ll.printLL();
                        break;
                    }
                case 3:
                    {
                        ll.reverseItr();
                        break;
                    }
                default:
                    {
                        System.out.println("Wrong choice");
                        break;
                    }
            }
            System.out.println("Do you want to continue?");
            ch=sc.next().charAt(0);


        }while(ch=='Y'|| ch =='y');
    }
    
}
