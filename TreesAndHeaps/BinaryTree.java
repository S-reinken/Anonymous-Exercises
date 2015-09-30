public class BinaryTree<E> {

    BinaryNode<E> root;

    public BinaryTree(E data) {
        root = new BinaryNode<E>(data);
    }

    public boolean search(E data) {
        if (root.getNode(data) != null) {
            return true;
        } else {
            return false;
        }
    }

    public void removeNode(E data) {
        if (root.removeNode(data)) {
            BinaryNode<E> tmp = root;
            root = root.getLeft();
            root.addNode(tmp.getRight().getData());
        }
    }

    public E get(E data) {
        return root.getNode(data).getData();
    }


}