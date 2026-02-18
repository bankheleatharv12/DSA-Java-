package LinkedList;
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


class Client{
    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.printSLL();

        ll.delFirst();
        ll.printSLL();

        ll.delLast();
        ll.printSLL();

        ll.addLast(444);
        ll.printSLL();

        ll.addAtPos(4,200);
        ll.printSLL();

        ll.delAtPos(4);
        ll.printSLL();

    }
}