package PG;

import java.util.Collections;
import java.util.PriorityQueue;

public class PG프린터 {
	public static void main(String[] args) {
		int[] priorities = {1,1,9,1,1,1};
		int location = 0 ;
		PG프린터 pg = new PG프린터();
		System.out.println(pg.solution(priorities,location));
	}
	public int solution(int[] priorities, int location) {
        int answer = 0;
        //우선순위 큐 or 힙 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());//최대값 순서로 
        for(int i = 0 ; i < priorities.length ; i++) {
        	pq.add(priorities[i]);
        	
        }
        while(!pq.isEmpty()) {// 같은 우선순위값들의 구분을 위해
	        for(int i = 0 ; i < priorities.length ; i++) {
	        	if(priorities[i] == pq.peek()) {
	        		if(i == location) {
	        			answer++;
	        			return answer;
	        		}
	        		pq.poll();
	        		answer++;
	        	}
	        }//for
        }//while
        return -1;
	}//solution
}
