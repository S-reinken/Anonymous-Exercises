public class BinaryNode<E> {

    private E item;
    private BinaryNode<E> node1;
    private BinaryNode<E> node2;

    public BinaryNode(E data) {
        item = data;
        node1 = null;
        node2 = null;
    }

    public BinaryNode<E> getLeft() {
        return node1;
    }

    public BinaryNode<E> getRight() {
        return node2;
    }

    public E getData() {
        return item;
    }

    public BinaryNode<E> getNode(E data) {
        if (data.equals(item)) {
            return this;
        } else if (data.hashCode() < item.hashCode()) {
            if (node1 != null) {
                return node1.getNode(data);
            } else {
                return null;
            }
        } else {
            if (node2 != null) {
                return node2.getNode(data);
            } else {
                return null;
            }
        }
    }

    public boolean removeNode(E data) {
        if (data.equals(item)) {
            return true;
        } else if (data.hashCode() < item.hashCode()) {
            if (node1 == null) {
                return false;
            } else if (node1.removeNode(data)) {
                BinaryNode<E> tmp = node1;
                node1 = node1.getLeft();
                node1.addNode(tmp.getRight());
            }
            return false;
        } else {
            if (node2 == null) {
                return false;
            } else if (node2.removeNode(data)) {
                BinaryNode<E> tmp = node2;
                node2 = node2.getLeft();
                node2.addNode(tmp.getRight());
            }
            return false;
        }
    }

    public void addNode(BinaryNode<E> n) {
        if (n.getData().hashCode() < item.hashCode()) {
            if (node1 == null) {
                node1 = n;
            } else {
                node1.addNode(n);
            }
        } else if (n.getData().hashCode() > item.hashCode()) {
            if (node2 == null) {
                node2 = n;
            } else {
                node2.addNode(n);
            }
        }
    }

    public void addNode(E data) {
        addNode(new BinaryNode<E>(data));
    }
}