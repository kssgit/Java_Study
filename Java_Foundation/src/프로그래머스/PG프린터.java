package 프로그래머스;

import java.util.PriorityQueue;

public class PG프린터 {
	public static void main(String[] args) {
		int[] priorities = {2,1,3,2};
		int location = 2 ;
		PG프린터 pg = new PG프린터();
		System.out.println(pg.solution(priorities,location));
	}
	public int solution(int[] priorities, int location) {
        int answer = 0;
        //우선순위 큐 or 힙 
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        for(int i = 0 ; i < priorities.length ; i++) {
        	pq.add(new Node(priorities[i],i));
        	
        }
        for(int i = 0 ; i < priorities.length ; i++) {
        	System.out.println(pq.poll().i);
        }
        return answer;
    }
}
class Node{
	int j ; // 노드의 중요도
	int i ;// 노드의 순서
	public Node(int j , int i) {
		// TODO Auto-generated constructor stub
		this.i = i;
		this.j = j;
	}
}