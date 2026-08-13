package CollectionFramework;

import java.util.Queue;

public class PriorityQueue {
    static void main() {

        Queue<Integer> pq = new java.util.PriorityQueue<>((a,b)->b-a);  //(a,b)--> b-a ye max heap mei convert kr deta hai

        //Default behavior --> integer case --> less value --> high priority --> min heap
        //pq--> strings--> comparator
        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(50);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);



    }
}
