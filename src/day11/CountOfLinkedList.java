package day11;
class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
public class CountOfLinkedList {
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
    public void co(){
        Node temp=head;
        int c=0;
        while(temp!=null){
            
            temp=temp.next;
            c++;
        }
            System.out.print("Count of LinkedList->"+c);

    }
    
    public static void main(String[] args) {
        CountOfLinkedList ob=new CountOfLinkedList();
        ob.addf(90);
        ob.addf(890);
        ob.addf(867);

        ob.co();


    }
}


