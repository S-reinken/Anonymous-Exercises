import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 100; i++) {
            Integer number = new Integer((int)(Math.random()*100));
            list.add(number);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(list.get(i).toString());
        }
    }
}