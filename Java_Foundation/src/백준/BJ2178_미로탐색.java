package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ2178_미로탐색 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); 
		int M = Integer.parseInt(st.nextToken());
		int[][] box = new int[N][M];
		for(int i = 0 ; i <N ;i++) {
			st =  new StringTokenizer(br.readLine());
			for(int j = 0 ; j < M ; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		// 			상 하 좌 우
		int[] xmv = {0,0,-1,1};
		int[] ymv = {-1,1,0,0};
		
		Queue<Node> queue = new LinkedList<>();
		queue.offer(new Node(0, 0, 1));//시작지점
		box[0][0] = 0; // 방문 처리
		int result = 0;
		
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			if(node.x == M-1 && node.y == N-1) {
				result = node.cost;
				break;
			}
			for(int i = 0 ; i<4 ; i++) {
				int dx = node.x +xmv[i];
				int dy = node.y +ymv[i];
				if(dx >=0 && dx <M && dy>=0 && dy<N && box[dy][dx]!=0) {
					queue.offer(new Node(dx, dy, node.cost+1));
					box[dy][dx] =0;
				}
			}
			
		}
		System.out.println(result);
	}
}
class Node{
	int x ;
	int y ;
	int cost;
	public Node(int x , int y , int cost) {
		this.x = x;
		this.y = y;
		this.cost = cost;
	}
}

