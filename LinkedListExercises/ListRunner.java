public class ListRunner {
    public static void main(String[] args) {
        MyLinkedList<Integer> mylist = new MyLinkedList<Integer>();
        mylist.addFirst(new Integer(12));
        mylist.addFirst(new Integer(40));
        mylist.addFirst(new Integer(34));
        mylist.displayList();
        mylist.addLast(new Integer(50));
        mylist.addLast(new Integer(100));
        mylist.removeFirst();
        System.out.println();
        mylist.displayList();
    }
}