package LinkedList;
import java.util.*;
class Node{
    int data;
    Node next=null;

    Node(int data){
        this.data=data;
    }
}

class LinkedList {

    Node head=null;

    //addFirst

    
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

    //printSLL
    

    //addAtLast

    void addLast(int data){
        Node newNode= new Node(data);
       

        if(head==null){
            head=newNode;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
                
            }
            temp.next=newNode;


        }

    }

    int countNode(){
        Node temp=head;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }
      return count;
    }

    //delFirst

    void delFirst(){

        if(head==null){
            System.out.println("List is empty");
        }
        if(countNode()==1){
            head=null;
        }
        else{
            head=head.next;
        }
    }

    

    //delLast

    void delLast(){
       

        if(head==null){
            System.out.println("Empty list");
            return;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
                
            }
            temp.next=null;


        }

    }



    //addAtPos
    
    void addAtPos(int pos, int data){

        if(pos<=0 || pos>countNode()+2 ){
            return;
        }
        if(pos==1){
            addFirst(data);
            return;
        }
        else if(pos==countNode()+1){
            addLast(data);
            return;
        }
        else{
            Node newNode= new Node(data);
            Node temp=head;

            while(pos-2!=0){
                temp=temp.next;
                pos--;
        }
            newNode.next=temp.next;
            temp.next=newNode;
        }

    }


    //delAtPos

    void delAtPos(int pos){

        if(pos<=0 || pos>countNode()+2 ){
            System.out.println("Wrong i/p");
            return;
        }
        if(pos==1){
            delFirst();
            return;
        }
        else if(pos==countNode()+1){
            delLast();    
        }
        else{
            Node temp=head;

            while(pos-2!=0){
                temp=temp.next;
                pos--;
        }
        temp.next=temp.next.next;
        }

    }

       void printSLL(){
        if(head==null){
            System.out.println("Empty linked list");
        }
        else{
            Node temp=head;

            while(temp.next!=null){
                System.out.print(temp.data+"-");
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    
    }


}


public class LinkedListSwitchCase{
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        char ch;
        do{
            System.out.println("Singly Linked List");
            System.out.println("1.addFirst");
            System.out.println("2.addLast");
            System.out.println("3.addAtPos");
            System.out.println("4.delFirst");
            System.out.println("5.delLast");
            System.out.println("6.delAtPos");
            System.out.println("7.countNode");
            System.out.println("8.printSLL");

            System.out.println("Enter your Choice: ");
            Scanner sc= new Scanner(System.in);
            int choice=sc.nextInt();

            switch(choice){
                
                case 1:{
                    System.out.println("Enter Data");
                    int data=sc.nextInt();
                    ll.addFirst(data);
                }
                break;

                 case 2:{
                    System.out.println("Enter Data");
                    int data=sc.nextInt();
                    ll.addLast(data);
                }

                 case 3:{
                    System.out.println("Enter Data");
                    int data=sc.nextInt();
                    System.out.println("Enter pos: ");
                    int pos=sc.nextInt();
                    ll.addAtPos(pos,data);
                }

                 case 4:{
                    ll.delFirst();
                    break;
                }

                 case 5:{
                    ll.delLast();
                    
                }

                 case 6:{
                    System.out.println("Enter pos: ");
                    int pos=sc.nextInt();
                    ll.delAtPos(pos);
                }
                break;

                 case 7:{
                    ll.countNode();
                    int ret=ll.countNode();
                    System.out.println(ret);
                }
                break;

                 case 8:{
                   ll.printSLL();
                   break;
                 }

                 default:
                    System.out.println("Wrong Choice");
                    break;

            }
            System.out.println("Continue?");
            ch=sc.next().charAt(0);

        }while(ch=='Y' || ch=='y');        

    }
}