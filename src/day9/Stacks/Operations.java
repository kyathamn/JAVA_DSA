package day9.Stacks;

public class Operations {

    int arr [] = new int[5];
    int top =- 1;
    void push(int data){
        if(top == arr.length-1){
            System.out.println("Stack overflow");
            return;
        }
        ++top;
        arr[top] = data;
        System.out.println(arr[top] + " -> Inserted");

    }
    void pop(){
        if (top == -1){
            System.out.println("Stack underflow");
            return;

        }
        System.out.println(arr[top]+ "-> deleted");
        top --;
        arr[top] = 0;
    }
    void peek(){
        if(top == -1){
            System.out.println("No values in stack");
            return;
        }
        System.out.println(arr[top] + "-> is peek element");
    }
    boolean search(int data){
        if(top == -1){
            System.out.println("stack is Empty");
            return false;
        }
        for(int i = 0; i <=top; i++){
            if(arr[i] == data){
                return true;
            }
        }
        return false;
    }
    void count(){   //void display
        if(top==-1){
            System.out.println("No element in Stack");
            return;
        }
        int c=0;
        for(int i=top;i>=0;i--){
            //if(i==0)
                System.out.println(arr[i]);
            //else
            //System.out.print(arr[i]+"->");
            c++;
        
        }
        System.out.println(c);
        }
        void display(){   
        if(top==-1){
            System.out.println("No element in Stack");
            return;
        }
        int c=0;
        for(int i=top;i>=0;i--){
            if(i==0)
                System.out.println(arr[i]);
            else
            System.out.print(arr[i]+"->");
            
        
        }
        System.out.println(c);
        }
    
    public static void main(String[] args) {
        Operations ob = new Operations();
        ob.push(90);
        ob.push(910);
        ob.push(190);
        ob.push(210);
        //ob.push(908);
        
        //ob.push(89);
        System.out.println(ob.search(908));
        //ob.peek();
        // ob.search();
        //ob.display();
        ob.count();
    }
}

