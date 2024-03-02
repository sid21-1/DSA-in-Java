package collections;

import java.util.ArrayDeque;

public class arraydequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);
        adq.offerFirst(33);
        adq.offerLast(88);
        System.out.println(adq);

        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq);
    }
}
