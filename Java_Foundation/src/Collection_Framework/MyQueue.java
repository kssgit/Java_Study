package Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		// ���� - offer
		// ���� - poll
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		q.offer(6);
		q.poll();
		q.offer(9);
		//���� ���� ���Һ��� ����
		while(!q.isEmpty()) {
			System.out.println(q.poll()+" ");
		}
	}
}
