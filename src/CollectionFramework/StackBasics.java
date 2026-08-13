package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class StackBasics {
    static void main() {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
