public class Test {
    int value;
    public Test(int v) {
        value = v;
    }

    public static void main(String ... args) {
        Test t1 = new Test(10);
        Test t2 = new Test(30);
        Test t3 = new Test(50);

        Stack<Test> stack = new Stack<Test>();

        stack.push(t1);
        stack.push(t2);
        stack.push(t3);

        boolean isNotNull = true;
        while (isNotNull) {
            Test t = stack.pop();
            if (t == null) {
                isNotNull = false;
            } else {
                System.out.println(t.value);
            }
        }

        Queue<Test> queue = new Queue<Test>();

        queue.add(t1);
        queue.add(t2);
        queue.add(t3);
    }
}