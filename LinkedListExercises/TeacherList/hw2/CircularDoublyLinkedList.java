/**
 * Your implementation of a CircularDoublyLinkedList
 *
 * @author YOUR NAME HERE
 * @version 1.0
 */
public class CircularDoublyLinkedList<T> implements LinkedListInterface<T> {

    // Do not add new instance variables.
    private LinkedListNode<T> head;
    private int size;

    /**
     * Creates an empty circular doubly-linked list.
     */
    public CircularDoublyLinkedList() {

    }

    /**
     * Creates a circular doubly-linked list with
     * {@code data} added to the list in order.
     * @param data The data to be added to the LinkedList.
     * @throws java.lang.IllegalArgumentException if {@code data} is null or any
     * item in {@code data} is null.
     */
    public CircularDoublyLinkedList(T[] data) {

    }

    @Override
    public void addAtIndex(int index, T data) {

    }

    @Override
    public T get(int index) {

    }

    @Override
    public T removeAtIndex(int index) {

    }

    @Override
    public void addToFront(T data) {

    }

    @Override
    public void addToBack(T data) {

    }

    @Override
    public T removeFromFront() {

    }

    @Override
    public T removeFromBack() {

    }

    @Override
    public int removeFirstOccurrence(T data) {

    }

    @Override
    public boolean removeAllOccurrences(T data) {

    }

    @Override
    public Object[] toArray() {

    }

    @Override
    public boolean isEmpty() {

    }

    @Override
    public int size() {

    }

    @Override
    public void clear() {

    }

    /* DO NOT MODIFY THIS METHOD */
    @Override
    public LinkedListNode<T> getHead() {
        return head;
    }
}
