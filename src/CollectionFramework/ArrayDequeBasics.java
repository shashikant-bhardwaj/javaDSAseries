package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayDequeBasics {
    static void main() {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offerFirst(20);
        q.offerLast(15);
        System.out.println(q);

        //pollLast
        q.pollLast();
        System.out.println(q);

        q.pollFirst();
        System.out.println(q);

        //peekFirst and peekLast
        System.out.println(q.peek());
        System.out.println(q.peekFirst());


        //size
        System.out.println(q.size());
    }
}
