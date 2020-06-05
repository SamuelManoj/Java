package collections_framework;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new ArrayBlockingQueue<Integer>(3);

		try {
			System.out.println("Head of the queue is : " + queue.element());
		} catch (NoSuchElementException e) {
			System.out.println("Queue is not started now");
		}

		queue.add(1);
		queue.add(3);
		queue.add(5);

		try {
			queue.add(10);
		} catch (IllegalStateException e) {
			System.out.println("Queue is full now");
		}

		System.out.println("Head of the queue is : " + queue.element());

		for (Integer val : queue) {
			System.out.println("Queue value : " + val);
		}

		System.out.println("Removed Item from queue : " + queue.remove());
		System.out.println("Removed Item from queue : " + queue.remove());
		System.out.println("Removed Item from queue : " + queue.remove());

		try {
			System.out.println("Removed Item from queue : " + queue.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Queue Items are removed");
		}

		///////////////////////// Moving to Queue 2/////////////////////////

		Queue<Integer> queue1 = new ArrayBlockingQueue<Integer>(3);

		queue1.offer(1);
		queue1.offer(3);
		queue1.offer(5);
		if (queue1.offer(1) == false) {
			System.out.println("Offer failed to add new element");
		}

		for (Integer que : queue1) {
			System.out.println("Queue1 Value is " + que);
		}

		System.out.println("Queue1 poll : " + queue1.poll());
		System.out.println("Queue1 poll : " + queue1.poll());
		System.out.println("Queue1 poll : " + queue1.poll());
		System.out.println("Queue1 poll : " + queue1.poll());

	}

}
