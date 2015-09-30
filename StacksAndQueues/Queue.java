import java.util.LinkedList;

public class Queue<E> {
    LinkedList<E> list;

    public Queue() {
        list = new LinkedList<E>();
    }

    public E next() {
        E item = list.getFirst();
        list.removeFirst();
        return item;
    }

    public void add(E item) {
        list.add(item);
    }

}