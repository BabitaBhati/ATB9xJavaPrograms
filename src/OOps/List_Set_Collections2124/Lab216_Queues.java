package OOps.List_Set_Collections2124;

import java.util.PriorityQueue;

public class Lab216_Queues {
    public static void main(String[] args) {
        // Queue - < 0.001% used in Automation.
        PriorityQueue pq= new PriorityQueue();
        // FIFO
        pq.offer("1"); // add
        pq.offer("3");
        pq.offer("2");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
