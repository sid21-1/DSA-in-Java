package collections;

import java.util.*;

public class PriorityQ {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(12);
        pq.offer(14);
        pq.offer(18);
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

        Queue<Integer> prq = new PriorityQueue<>(Comparator.reverseOrder());
        prq.offer(40);
        prq.offer(12);
        prq.offer(14);
        prq.offer(18);
        System.out.println(prq);

        prq.poll();
        System.out.println(prq);

        System.out.println(prq.peek());
    }
}
