package day9.Queue;

public class NQueues {
    int front=-1;
    int rear=-1;
    int arr[]=new int[5];
    void en(int data){
        if(rear==arr.length-1){
            System.out.println("Queue overflow");
            return;
        }
        if(front==-1){
            front=0;

        }
        rear++;
        arr[rear]=data;
        System.out.println(arr[rear]+"->inserted");
        
    }
    void peek(){//de
        if(front==-1){   //if(front==-1 || front>rear){
            System.out.println("Queue is underflow");
            return;
        }
        System.out.println(arr[front]+"->peek");
        front++;
    }
    void de(){ //de
        if(front==-1 || front>rear){
            System.out.println("Queue is underflow");
            return;
        }
        System.out.println(arr[front]+"->delete");
        front++;
    }
    void display(){   
        if(front==-1|| front>rear){
            System.out.println("No element in queue");
            return;
        }
        int c=0;
        for(int i=front;i<=rear;i++){
            if(arr[i]==arr[rear])
                System.out.println(arr[i]);
            else
            System.out.print(arr[i]+"->");
            
        
        }
        System.out.println(c);
        }
    public static void main(String[] args) {
        NQueues ob=new NQueues();
        ob.en(99);
        ob.en(767);
        ob.en(12);
        ob.en(60);
        ob.de();
        //ob.de();
        ob.peek();
        ob.display();

    }
    
}
