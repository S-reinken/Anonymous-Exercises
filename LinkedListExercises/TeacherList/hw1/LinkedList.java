public class LinkedList {
    private Node head;
    public LinkedList() {
        head = null;
    }
    public void addToFront(int data) {
        head = new Node(data, head);
        //if (head==null) {
        //    blah blah
        //else {
        //    blah bhal
        //}
    }

    private class Node {
        private int data;
        private Node next;
        private Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LinkedList ages = new LinkedList();
        System.out.println(ages);
    }
}