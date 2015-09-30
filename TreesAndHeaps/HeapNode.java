public class HeapNode<E> {

    E item;
    HeapNode<E> node1;
    HeapNode<E> node2;

    public HeapNode(E data) {
        item = data;
        node1 = null;
        node2 = null;
    }

    public E getData() {
        return item;
    }

    public HeapNode<E> getLeft() {
        return node1;
    }

    public HeapNode<E> getRight() {
        return node2;
    }

    public int addNode(E data, int r) {
        if (node1 == null && node2 == null) {
            return r + 1;
        }
        else if (node1 != null && node2 != null) {
            if (node2.addNode(data, r + 1) == 0) {
                swap(node2);
                return 0;
            } else if (node1.addNode(data, r + 1)
                       > node2.addNode(data, r + 1)) {
                node2.addNewRow(data);
                return 0;
            } else {
                swap(node1);
                return node1.addNode(data, r + 1);
            }
        } else {
            node2 = new HeapNode<E>(data);
            return 0;
        }
    }

    public void removeNode(E data) {
    }

    public void addNewRow(E data) {
        if (node1 != null) {
            node1.addNewRow(data);
        } else {
            node1 = new HeapNode<E>(data);
        }
        if (node1.getLeft() != null) {
            swap(node1);
        }
    }

    public void swap(HeapNode<E> n) {
        if (n.getLeft() != null) {
            swp(n, n.getLeft());
        }
        if (n.getRight() != null) {
            swp(n, n.getRight());
        }
    }

    public void swp(HeapNode<E> n, HeapNode<E> node) {
        if (n.getData().hashCode() > node.hashCode()) {
            HeapNode<E> tmp = n;
            n = node;
            node = tmp;
        }
    }
}