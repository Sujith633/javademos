package sample;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		System.out.println(q.remove());
	}

}
