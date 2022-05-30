package LinkedList.Example;

public class Main {
   public static void main(String[] args) {
       LL list = new LL();
       list.insertFirst(3);
       list.insertFirst(9);
       list.insertFirst(12);
       list.insertFirst(15);
       list.insertFirst(18);
       list.insertLast(10);
       list.inserIndex(50, 3);
       System.out.println("The Deleted fast item is "+list.deletefirst());
       System.out.println("The Deleted Last item is "+list.deleteLast());
       System.out.println("The Deleted index item is "+list.deletIndex(2));
       list.display();
   }
}
