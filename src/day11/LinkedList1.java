package day11;

//node creation

class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
public class LinkedList1 {
    Node head;
    public void addf(int data){
        
        Node nn=new Node(data);
        if(head==null){
            head=nn;
            return;
        }
        nn.next= head;
        head=nn;

    
    }
    public void pl(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
            System.out.print("null");

    }
    
    public static void main(String[] args) {
        LinkedList1 ob=new LinkedList1();
        ob.addf(90);
        ob.addf(890);
        ob.addf(867);

        ob.pl();


    }
}