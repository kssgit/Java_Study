package Algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	// 각 노드의 방문 확인
	public static boolean[] visited = new boolean[9]; 
	//graph 생성
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	//BFS 구현
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		visited[start] = true;
		
		//큐가 빌 때까지 반복
		while(!q.isEmpty()) {
			//큐에서 하나의 원소를 뽑아 출력
			int x = q.poll();
			System.out.println(x + " ");
			//해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
			for(int i = 0 ; i < graph.get(x).size(); i++) {
				int y = graph.get(x).get(i);
				if(!visited[y]) {
					q.offer(y);
					visited[y] = true;
				}
			}
			
		}
	}
	
}
