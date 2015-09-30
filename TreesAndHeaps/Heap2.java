import java.util.ArrayList;

public class Heap2<E> {
    ArrayList<E> list;

    public Heap2() {
        list = new ArrayList<E>();
    }

    public void addNode(E data) {
        list.add(data);
        check(list.size() - 1);
    }

    public void removeNode(E data) {
        int index = list.indexOf(data);
        list.remove(index);
        for (int i = index; i < list.size(); i++) {
            check(i);
        }
    }

    public void check(int index) {
        for (int i = index; i > 0; i = i / 2) {
            if (list.get(i).hashCode()
                > list.get(i / 2).hashCode()) {
                swap(i);
            }
        }
    }

    public void swap(int i) {
        E tmp = list.get(i);
        list.set(i, list.get(i / 2));
        list.set(i / 2, tmp);
    }
}