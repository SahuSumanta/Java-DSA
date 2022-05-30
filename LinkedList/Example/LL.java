package LinkedList.Example;

/**
 * LL
 */
public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    //Insert Fast
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next= head;
        head = node;

        if (tail == null) {
            tail = head;   
        }
        size+=1;
    }

    //Insert last
    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //Insert Index
    public void inserIndex(int val, int index){
        if(index == 0){
            insertFirst(val); return;
        }

        if(index == size){
            insertLast(val); return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next=node;
        size++;
    }

    //Delet First
    public int deletefirst(){
        int val = head.value;
        head = head.next;

        if(head == null) tail = null;

        size--;
        return val;
    }
    
    //Delet Last
    public int deleteLast(){
        if(size <= 1) return deletefirst();

        Node secondlast = get(size-2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        return val; 
    }

    //Delet particular index
    public int deletIndex(int index){
        if (index == 0) {
            return deletefirst();
        }
        
        if (index == size-1) {
            return deleteLast();
        }

        Node prev = get(index -1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;

    }

    //Find value
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }


    private Node get(int i) {
        Node node = head;
        for (int j = 0; j < i; j++) {
            node = node.next;           
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node {
    
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }
}