public class MyLinkedList<E> {
    private Node first;
    private Node last;


    public MyLinkedList() {
        first = null;
        last = null;
    }

    private class Node<E> {
        private Node next;
        private Node prev;
        private E data;
        public Node(E object) {
            data = object;
        }
        public E getData() {
            return data;
        }
        public Node getNext() {
            return next;
        }
        public Node getPrev() {
            return prev;
        }
    }

    public void addFirst(E object) {
        Node tmp = new Node(object);
        if (isEmpty()) {
            tmp.next = null;
            tmp.prev = null;
            first = tmp;
            last = tmp;
        } else {
            tmp.next = first;
            tmp.prev = null;
            first.prev = tmp;
            first = tmp;
        }
    }

    public void addLast(E object) {
        Node tmp = new Node(object);
        if (isEmpty()) {
            tmp.next = null;
            tmp.prev = null;
            first = tmp;
            last = tmp;
        } else {
            tmp.next = null;
            tmp.prev = last;
            last.next = tmp;
            last = tmp;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Node tmp = first.getNext();
            tmp.prev = null;
            first = null;
            first = tmp;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Node tmp = last.getPrev();
            tmp.next = null;
            last = null;
            last = tmp;
        }
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void displayList() {
        Node current = first;
        while (current != null) {
            System.out.println(current.data);
            current = current.getNext();
        }
    }
}
