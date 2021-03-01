package basics;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Queue001 {

	public static void main(String[] args) {

		Random ran=new Random();
		Queue <Integer> q1= new PriorityQueue<Integer>();
		
		for(int i=0;i<10;i++) {
			q1.add(ran.nextInt(100));
		}
		System.out.println(q1);
		System.out.println(q1.peek());
		
		System.out.println(q1.poll());
		System.out.println(q1);
		
		
		
	}

}
