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
		int rx = 0,ry=0,bx=0,by=0;
		boolean[][][][] visited = new boolean[N][M][N][M];
		Queue<Node> q = new LinkedList<>();
		for(int i = 0 ; i < N ; i++) {
			String input = br.readLine();
			for(int j = 0 ; j < M ; j++) {
				board[i][j] =input.charAt(j);
				if(board[i][j]=='R') {
					rx =j;
					ry =i;
				}
				if(board[i][j]=='B') {
					bx = j;
					by = i;
				}
			}
		}
		q.offer(new Node(rx, ry, bx, by, 1));
//		System.out.println(Arrays.deepToString(board));
		visited[ry][rx][by][bx]=true;
		//사방 탐색		상 하 좌 우
		int[] dx = {0,0,-1,1};
		int[] dy = {-1,1,0,0};
		int result = -1;
		//bfs
		out:while(!q.isEmpty()) {
			Node n = q.poll();
			//10번이상 움직이면 -1
			if(n.count > 10) break;
			//탐색
			for(int i = 0 ; i < 4 ; i++) {
				//미리 이동위치를 더해주면 벽이 나올경우 캐치를 못한다
				int rmx = n.rx ;
				int rmy = n.ry ;
				int bmx = n.bx ;
				int bmy = n.by ;
				boolean rHol = false;
				boolean bHol = false;
				//빨간구슬이 벽을 만날때 까지 이동
				while(board[rmy+dy[i]][rmx+dx[i]]!='#') {
					rmx+=dx[i];
					rmy+=dy[i];
					if(board[rmy][rmx]=='O') {
						rHol = true;
						break;
					}
				}
				//파란구슬이 벽을 만날 때 까지 이동
				while(board[bmy+dy[i]][bmx+dx[i]]!='#') {
					bmx+=dx[i];
					bmy+=dy[i];
					if(board[bmy][bmx]=='O') {
						bHol = true;
						break;
					}
				}
				//빨간 구슬만 빠질 경우 
				if(rHol && !bHol) {
					result = n.count;
					break out;
				}
				//파란구슬이 빠질 경우
				if(bHol)continue; //다른 경우도 있을 수 있으므로
				//파란 구슬과 빨간 구슬의 위치가 같을 경우
				if(rmx == bmx && rmy == bmy ) {
					if(i==0) {//상  y
						//기존  y값이 큰게 더 아래쪽 위치 
						if(n.ry >n.by) rmy+=1;
						else bmy+=1;
					}
					if(i==1) {//하 y
						//기존 y값이 작은게 더 위에 위치
						if(n.ry >n.by) bmy-=1;
						else rmy-=1;
					}
					if(i==2) {//좌 x
						if(n.rx>n.bx) rmx+=1;
						else bmx+=1;
					}
					if(i==3) {//우 x
						if(n.rx>n.bx) bmx-=1;
						else rmx-=1;
					}
				
				}
				// 둘다 구멍에 빠지지 않을 경우  q에 삽입
				//처음 방문하는 곳일 경우
				if(!visited[rmy][rmx][bmy][bmx]) {
					visited[rmy][rmx][bmy][bmx]=true;
					q.offer(new Node(rmx, rmy, bmx, bmy, n.count+1));
				}
			}
			
		}
		System.out.println(result);
		
	}
}
class Node{
	int rx,ry,bx,by,count;
	public Node(int rx , int ry, int bx , int by,int count) {
		this.rx = rx;
		this.ry = ry;
		this.bx = bx;
		this.by = by;
		this.count = count;
	}
}
