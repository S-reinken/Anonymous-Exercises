import java.util.ArrayList;

public class Stack<E> {

    private ArrayList<E> list;
    public Stack() {
        list = new ArrayList<E>();
    }

    public void push(E item) {
        list.add(item);
    }

    public E pop() {
        if (list.size() > 0) {
            E item = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return item;
        } else {
            return null;
        }
    }
}