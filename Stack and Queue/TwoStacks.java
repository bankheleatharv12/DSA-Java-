import java.util.*;
class TwoStacks {

    int stackArr[];
    int top1;
    int top2;
    int maxSize;

    TwoStacks(int size){
        this.stackArr=new int[size];
        this.top1=-1;
        this.top2=size;
        this.maxSize=size;
    }

    void push1(int data){

        if(top2 - top1>1){
            top1++;
            stackArr[top1]=data;
        }else{
            System.out.println("Stack overflow");
        }
    }

    void push2(int data){

        if(top2 - top1>1){
            top2--;
            stackArr[top2]=data;
        }else{
            System.out.println("Stack overflow");
        }
    }

    
    int pop1(){

        if(top1==-1){
            System.out.println("Stack is empty");
            return -1;
        }else{
            int val=stackArr[top1];
            top1++;
            return val;
        }
    }
    
    int pop2(){

        if(top1==maxSize){
            System.out.println("Stack is empty");
            return -1;
        }else{
            int val=stackArr[top2];
            top2++;
            return val;
        }
    }
}

class Client{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter size of array: ");
        int size=sc.nextInt();

        TwoStacks obj=new TwoStacks(size);
        char ch;

        do{
            System.out.println("1.Push1");
            System.out.println("2.Push2");
            System.out.println("3.Pop1");
            System.out.println("4.Pop2");
           
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();

            switch(choice){

                case 1:{
                    System.out.println("Enter element for stack: ");
                    int data=sc.nextInt();
                    obj.push1(data);
                }
                break;

                 case 2:{
                    System.out.println("Enter element for stack: ");
                    int data=sc.nextInt();
                    obj.push2(data);
                }
                break;

                case 3:{
                    int ret=obj.pop1();

                    if(ret!=-1){
                        System.out.println(ret + " popped from stack");
                    }
                }
                break;

                case 4:{
                    int ret=obj.pop2();

                    if(ret!=-1){
                        System.out.println(ret + " popped from stack");
                    }
                }
                break;

                default:
                    System.out.println("Wrong choice");
                    break;
            }
            System.out.println("Do you want to continue?");
            ch=sc.next().charAt(0);

        }while(ch=='Y' || ch=='y');

                
                }
}


