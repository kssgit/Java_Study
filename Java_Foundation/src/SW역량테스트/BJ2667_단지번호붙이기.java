package SW역량테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class BJ2667_단지번호붙이기 {
	static int[][] box;
	//                 상 하 좌 우
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
	static int dangi=0;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		box = new int[N][N];
		for(int i = 0 ; i < N ; i++) {
			String input = br.readLine();
			for(int j = 0 ; j < N ; j++) {
				box[i][j] = input.charAt(j)-'0';
			}
		}
//		System.out.println(Arrays.deepToString(box));
		
		for(int i = 0 ; i < N ; i++) {
			for(int j =0 ; j < N ; j++) {
				if(box[i][j]==1) {
					bfs(i,j);
					dangi++;
				}
			}
		}
		
		System.out.println(dangi);
		for(int i = 0 ; i < dangi ; i++) {
			System.out.println(pq.poll());
		}
		
	}
	static void bfs(int y , int x) {
		Queue<Node2> q = new LinkedList<>();
		int hc = 0;
		q.offer(new Node2(x, y));
		while(!q.isEmpty()) {
			Node2 n = q.poll();
			//사방 탐색
			for(int i = 0 ; i < 4 ; i++) {
				int mx = n.x + dx[i];
				int my = n.y + dy[i];
				if(my<0 || my>=N || mx < 0 || mx >=N || box[my][mx]==0) continue;
				q.offer(new Node2(mx , my));
				hc++;
				box[my][mx] = 0;
			}
		}
		pq.offer(hc);
		
 	}
}
class Node2{
	int x , y ;
	public Node2(int x , int y ) {
		this.x =x;
		this.y =y;
		
	}
}
