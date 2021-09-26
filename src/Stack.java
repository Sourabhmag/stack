public class Stack {
    Node head = null;
    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else {
            Node temp = head;
            while (temp.next!= null){
                temp = temp.next;
            }
            temp.next = newNode;
            System.out.println(data+" has been pushed");
        }
    }

    public void pop(){
        if(head == null)
            System.out.println("stack is underflow");
        else if(head.next == null){
            System.out.println(head.data+" has bee popped");
            head = null;
        }
        else {
            Node temp = head;
            while (temp.next.next != null){
                temp = temp.next;
            }
            System.out.println(temp.next.data+" has bee popped");
            temp.next = null;
        }
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" => ");
            temp = temp.next;
        }
    }
}
