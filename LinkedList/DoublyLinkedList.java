package LinkedList;
class Node{
    Node prev=null;
    int data;
    Node next=null;

    Node(int data){
        this.data=data;
    }
}

class DoublyLinkedList{

    Node head=null;

    
    void addFirst(int data){

        
         Node newNode=new Node(data);

        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;

        }
    }

    int countNode(){
        int count=0;
        if(head==null){
            return count;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                count++;
                temp=temp.next;
            }
        }
    return count;
    }

    void addLast(int data){

       
        Node newNode= new Node(data);

        if(head==null){
            head=newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                 temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;

        }

           
    }


    

    void printDLL(){
        
       
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

    void addAtPos(int pos, int data){

        Node newNode=new Node(data);

        if(pos<=0 || pos>=countNode()+2 ){
            System.out.println("Wrong i/p");
            return;
        }

        if(pos==1){
            addFirst(data);
            return;
        }else if(pos==countNode()+1){
            addLast(data);
            return;
        }

        else{
    
        Node temp=head;

        while(pos-2!=0){
             temp=temp.next;
             pos--;
        }
        newNode.prev=temp;
        newNode.next=temp.next;
        temp.next=newNode;
        newNode.next.prev=newNode;
    }
    }

    void delFirst(){

        if(head==null){
            System.out.println("Empty linked list");
        }else if(countNode()==1){
            head=null;
        }else{
            head=head.next;
            head.prev=null;
        }
    }

    void delLast(){

        if(head==null){
            System.out.println("Empty linked list");
        }else if(countNode()==1){
            head=null;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.prev.next=null;
            temp.prev=null;
        }
    }

    void delAtPos(int pos){
        if(pos<=0 || pos>=countNode()+1){
            System.out.println("Wrong input");
            return;
        }
        if(pos==1){
            delFirst();
        }else if(pos==countNode()){
            delLast();
        }else{
            Node temp=head;
            while(pos-2!=0){
                temp=temp.next;
                pos--;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
        }
    }
}


class Client{
    public static void main(String[] args) {
        DoublyLinkedList obj=new DoublyLinkedList();
        obj.addFirst(10);
        obj.addFirst(20);
        obj.addFirst(80);
        obj.addFirst(90);
        obj.printDLL();
        obj.addLast(55);
        obj.printDLL();
        int ret=obj.countNode();
        System.out.println(ret);
        obj.addAtPos(1,22);
        obj.printDLL();
        obj.delFirst();
        obj.printDLL();
        obj.delLast();
        obj.printDLL();
        obj.delAtPos(2);
    }
}
