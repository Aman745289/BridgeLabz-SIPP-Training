package Collections;

import java.util.*;

public class StackUsingQueues {
    static class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public void push(int x) {
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

        public int pop() {
            if (q1.isEmpty()) return -1;
            return q1.remove();
        }

        public int top() {
            if (q1.isEmpty()) return -1;
            return q1.peek();
        }

        public boolean isEmpty() {
            return q1.isEmpty();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element after pop: " + stack.top());
    }
}

