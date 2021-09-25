package Data_Structure;

import java.util.LinkedList;
import java.util.Queue;

public class 큐 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		// 삽입- offer
		// 추출 - poll
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		q.offer(6);
		q.poll();
		q.offer(9);
		//queue 값 확인
		while(!q.isEmpty()) {
			System.out.println(q.poll()+" ");
		}
	}
}
