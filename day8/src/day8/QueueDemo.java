package day8;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> pq=new PriorityQueue<Integer>();
        pq.add(200);
        pq.add(300);
        pq.add(400);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
	}

}
