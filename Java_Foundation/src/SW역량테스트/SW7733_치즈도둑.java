package SW역량테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SW7733_치즈도둑 {
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int[][] box ;
	static int count , N;
	static boolean[][] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			box = new int[N][N];
			count = 0;
			int max_day = 0;
			int min_day = 101;
			for(int j = 0 ; j < N ; j++) {
				st = new StringTokenizer(br.readLine());			
				for(int k = 0 ; k < N ; k++) {
					box[j][k] = Integer.parseInt(st.nextToken());
					max_day = Math.max(max_day, box[j][k]);
					min_day = Math.min(min_day, box[j][k]);
				}	
			}
			for(int j = min_day ; j < max_day ; j++) {
				int max =0;
				visited = new boolean[N][N];
				for(int q = 0 ; q < N ; q++) {
					for(int w = 0 ; w < N ; w++) {
						if(box[q][w] != j && visited[q][w] ==false) {
							bfs(j,new Node4(w, q));
							max++;
						}else {
							box[q][w] = 0;
						}
					}
				}
				
				count = Math.max(max, count);
			}
			System.out.printf("#%d %d\n",i+1,count);
		}//out
	}
	static void bfs(int day, Node4 n4) {
		
		Queue<Node4> q = new LinkedList<Node4>();
		q.offer(n4);
		while(!q.isEmpty()) {
			Node4 n = q.poll();
			for(int i = 0 ; i < 4 ; i++) {
				int mx = n.x + dx[i];
				int my = n.y + dy[i];
				if(mx < 0 || mx >=N || my <0 || my >= N  || box[my][mx] == day || box[my][mx] ==0 || visited[my][mx]==true) continue;
				q.offer(new Node4(mx, my));
				visited[my][mx] = true;
			}
		}

	}
	
}
class Node4{
	int x, y;
	public Node4(int x, int y) {
		this.x = x;
		this.y = y;
	}
}