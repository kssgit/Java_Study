package 프로그래머스;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PG거리두기 {
	public static void main(String[] args) {
		PG거리두기 pg = new PG거리두기();
		String[][] places  = {
				{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, 
		        {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, 
		        {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, 
				{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, 
				{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
							};
		int[] result = pg.solution(places);
		for(int w : result) {
			System.out.println(w);
		}
	}
	public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        for(int i = 0 ; i < places.length; i++) {
        	if(check(places[i])) {
        		answer[i] = 1;
        	}else {
        		answer[i]=0;
        	}
        }//out for
        return answer;
    }
	
	boolean check(String[] place) {
		for(int y = 0 ; y < 5 ; y++) {
			for(int x = 0 ; x < 5 ; x++) {
				if(place[y].charAt(x) == 'P') {
					if(!bfs(place , y,x)) return false;
				}
			}
		}
		return true;
	}
	
	
	boolean bfs(String[] place,int y, int x) {
		// 4방       상 하 좌 우
 		int[] dx = {0,0,-1,1};
 		int[] dy = {-1,1,0,0};
 		boolean[][] visited = new boolean[5][5];
 		Queue<Node> q = new LinkedList<Node>();
 		q.add(new Node(y,x,0));
 		visited[y][x] = true;
 		while(!q.isEmpty()) {
 			Node n = q.poll();
 			if(n.dist>2) continue;
 			if(n.dist!=0 && place[n.y].charAt(n.x)=='P') return false;
 			for(int i = 0 ; i < 4 ; i++) {
 				int my = n.y + dy[i];
 				int mx = n.x + dx[i];
 				if(my<0 || mx<0 || my>=5 || mx>=5 || 
 						visited[my][mx]==true || place[my].charAt(mx)=='X') continue;
 				q.add(new Node(my,mx,n.dist+1));
 				visited[my][mx]=true;
 			
 			}
 		}
		
		return true;
	}
	
	class Node{
		int y,x,dist;
		public Node(int y, int x,int dist) {
			this.y = y;
			this.x = x;
			this.dist = dist;
		}
	}
	
}


