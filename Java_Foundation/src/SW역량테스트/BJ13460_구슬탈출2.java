package SW역량테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ13460_구슬탈출2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] board = new char[N][M];
		Queue<Node> rq = new LinkedList<>();
		Queue<Node> bq = new LinkedList<>();
		for(int i = 0 ; i < N ; i++) {
			String input = br.readLine();
			for(int j = 0 ; j < M ; j++) {
				board[i][j] =input.charAt(j);
				if(board[i][j]=='R') rq.offer(new Node(j, i, 1));
				if(board[i][j]=='B') bq.offer(new Node(j, i, 1));
			}
		}
//		System.out.println(Arrays.deepToString(board));
		//사방 탐색		상 하 좌 우
		int[] dx = {0,0,-1,1};
		int[] dy = {-1,1,0,0};
		int result = -1;
		//bfs
		out:while(!rq.isEmpty()) {
			Node rn = rq.poll();
			Node bn = bq.poll();
			//탐색
			for(int i = 0 ; i < 4 ; i++) {
				int rmx = rn.x + dx[i];
				int rmy = rn.y + dy[i];
				int bmx = bn.x + dx[i];
				int bmy = bn.y + dy[i];
				if()
				//벽이거나 빨간 구슬 또는 파란 구슬을 만났을 경우 제자리 노드를 다시 큐에 삽입
				if(board[rmy][rmx]=='#' || board[rmy][rmx]=='B' ) {
					rq.offer(rn);
					continue;
				}
				if(board[bmy][bmx]=='#' || board[bmy][bmx]=='R') {
					bq.offer(bn);
					continue;
				}
				// 같이 구멍에 떨어질 경우 또는 파란구슬만 떨어질 경우
				if(board[rmy][rmx]=='O' && board[bmy][bmx]=='O' ) break out;
				if(board[bmy][bmx]=='O') break out;
				//
				if(board[rmy][rmx]=='O') {
					result = rn.count; 
					break out;
				}
				rq.offer(new Node(rmx,rmy,rn.count+1));
				bq.offer(new Node(bmx,bmy,bn.count+1));
				board[rmy][rmx] = 'R';
				board[rn.y][rn.x] = '.';
				board[bmy][bmx] = 'B';
				board[bn.y][bn.x] = '.';
			}
			
		}
		System.out.println(result);
		
	}
}
class Node{
	int x,y,count;
	public Node(int x , int y, int count) {
		this.x =x ;
		this.count = count;
		this.y = y;
	}
}
