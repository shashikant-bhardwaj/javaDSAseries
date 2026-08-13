package CollectionFramework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    static void main() {

        /*Queue --> isemi hum addFirst , addLast aur getFirst jaise
                     method use nhi kr sakte kyuki ye normal queue hai.*/

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);

        //poll--> return and remove elememt
        System.out.println("removing: " +q.poll());
        System.out.println("after poll :" +q);

        // peek
        System.out.println(q.peek());



        /*Deque --> ismei hum addFirst , addLast aur getFirst
                    jaise method use kr sakte ho */

        Deque<Integer> d = new LinkedList<>();
        d.offerFirst(1);  // d.addFirst use nhi krenge
        d.offer(2);
        d.add(3);

        /* pollFirst()
           pollLast()
           peekFirst()
           peekLast()
         */

        System.out.println(d);

        //poll--> return and remove elememt
        System.out.println("removing: " +d.poll());
        System.out.println("after poll :" +d);

        // peek
        System.out.println(d.peek());

    }
}
