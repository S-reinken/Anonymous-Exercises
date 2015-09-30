public class Heap<E> {

    HeapNode<E> root;

    public Heap(E data) {
        root = new HeapNode<E>(data);
    }

    public void addNode(E data) {
        if (root.addNode(data, 1) != 0) {
            root.addNewRow(data);
        }
    }
}