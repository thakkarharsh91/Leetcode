package easy;

import java.util.ArrayDeque;
import java.util.Queue;

public class SlidingWindow {

	private static Queue<Integer> queue;
	private int maxCapacity;
	private int sum = 0;

	public SlidingWindow(int size){
		queue = new ArrayDeque<>();
		this.maxCapacity = size;
	}

	public static void main(String[] args) {
		SlidingWindow sw= new SlidingWindow(3);
		System.out.println(sw.next(1));
		System.out.println(sw.next(10));
		System.out.println(sw.next(3));
		System.out.println(sw.next(5));
	}

	private double next(int i) {
		if(queue.size() == this.maxCapacity)
			sum -= queue.poll();
		queue.offer(i);
		sum += i;
		return (double) sum/queue.size();
	}
}
