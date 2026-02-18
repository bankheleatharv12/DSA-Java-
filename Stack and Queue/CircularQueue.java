import java.util.*;

class CircularQueue{

    int dequeArr[];
    int front;
    int rear;
    int maxSize;

    CircularQueue(int size){
        this.dequeArr=new int[size];
        this.front=-1;
        this.rear=-1;
        this.maxSize=size;
    }

    void enqueue(int data){

        if((front==0 && rear==maxSize-1) && ((rear+1)%maxSize==front)){
            System.out.println("Queue is full");
            return;
        }else if(front ==-1){
            front=rear=0;
        }else if(rear==maxSize-1 && front!=0){
            rear=0;
        }else{
            rear++;
        }

        dequeArr[rear]=data;
    }

    int dequeue(){

        if(front==-1){
            System.out.println("Queue is empty");
            return -1;
        }else{

            int ret=dequeArr[front];

            if(front==rear){
                rear=front=-1;
            }else if(front==maxSize-1){
                front=0;
            }else{
                front++;
            }
        }
        
        return -1;
    }

    void printQueue(){

        if(front<=rear){

            for(int i=front; i<=rear; i++){
                System.out.println(dequeArr[i]+" ");
        }else{
            for(int i=0; i<maxSize; i++){
                System.out.println(queueArr[i]+" ");
            }
            for(int i=0; i<=rear; i++){
                System.out.println(queueArr[i]+" ");
            }
        }
        System.out.println();

    }
}

class Client{
    public static void main(String[] args){
        System.out.println("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        CircularQueue cq=new CircularQueue(size);
        char ch;

        do{
            switch(choice){

                case 1:{
                    System.out.println("Enter data to enter:");
                    int data=sc.nextInt();
                    cq.enqueue(data);
                }

                case 2:{
                    int ret=cq.dequeue();
                    
                    if(ret!=-1){
                        System.out.println(ret+ "popped");
                    }
                }

                case 3:{
                    cq.printQueue();
                    
                }
                break;

                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("Do you want to continue?");
            ch=sc.next().charAt(0);

        }while(ch=='Y'|| ch=='y');
    }
}
}