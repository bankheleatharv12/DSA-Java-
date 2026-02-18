import java.util.Scanner;

import Stacks.Client;

class Client{

    int queueArr[];
    int front;
    int rear;
    int maxSize;

    Queue(int size){
        this.queueArr=new int [size];
        this.front=-1;
        this.rear=-1;
        this.maxSize=size;
    }

    void enqueue(int data){

        if(rear==maxSize-1){
            System.out.println("Queue is full");
            return;
        }
        
        if(front==-1){
            front=rear=0;
        }else{
            rear++;
        }
        queueArr[rear]=data;
    }

    int dequeue(){

        if(front==-1){
            System.out.println("Queue is empty");
            return -1;
        }else{
            int ret=queueArr[front];
            front++;
            if(front>rear){
                rear=front=-1;
            }
            return ret;
        }

    }

    boolean empty(){

        if(front==-1){
            return true;
        }else{
            return false;
        }
    }

    int front(){
        
        if(front==-1){
            System.out.println("Queue is empty");
        }
        return queueArr[front];
    }
       
    

    int rear(){

        if(rear==-1){
            System.out.println("Queue is empty");
        }
        return queueArr[rear];
    }

    void printQueue(){

        if(front==-1){
            System.out.println("Queue is empty");
            return;
        }else{

            for(int i=front; i<=rear; i++){
                System.out.println(queueArr[i]+" ");
            }
            System.out.println();
        }
    }

}

class Queue{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();
        
        Client q=new Client(size);
        char ch;

        do{
            System.out.println("1.Enqueue");
            System.out.println("2.Dequeue");
            System.out.println("3.Empty");
            System.out.println("4.front");
            System.out.println("5.rear");
            System.out.println("printQueue");

            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();

            switch(choice){

                case 1:
                    {
                        System.out.println("Enter data to enqueue: ");
                        int data=sc.nextInt();
                        q.enqueue(data);
                    }
                    break;
                case 2:
                    {
                        int ret=q.dequeue();
                        if(ret!=-1){
                            System.out.println(ret + "popped");
                        }                    
                    }
                    break;

                case 3:
                    {
                        boolean ret=q.empty();

                        if(ret){
                            System.out.println("Queue is empty");
                        }else{
                            System.out.println("Queue isnot empty");
                        }
                    }
                    break;

                case 4:
                    {
                        int ret=q.front();

                        if(ret!=-1){
                            System.out.println("Front element is: "+ret);
                        }
                    }
                    break;
                case 5:
                    {
                        int ret=q.rear();

                        if(ret!=-1){
                            System.out.println("Rear element is: "+ret);
                        }
                    }
                    break;
                case 6:
                    {
                        q.printQueue();
                    }
                    break;
                default:
                    System.out.println("wrong choice");
                    break;
            }
            System.out.println("Do you want to continue?");
            ch=sc.next().charAt(0);

        }while(ch=='Y'|| ch=='y');

    }
}