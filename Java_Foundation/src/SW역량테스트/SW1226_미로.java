package SW역량테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SW1226_미로 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		out:for(int i = 0 ; i < 10 ; i++) {
			int N = Integer.parseInt(br.readLine());
			int[][] box = new int[16][16];
			int x = 0;
			int y = 0;
			for(int j = 0 ; j < 16 ; j++) {
				String input = br.readLine();
				for(int k = 0 ; k < 16 ; k++) {
					box[j][k] = input.charAt(k)-'0';
					if(box[j][k] == 3) {
						x = k;
						y = j;
					}
				}
			}
			box[1][1] = 1;
			Queue<Node3> q = new LinkedList<>();
			q.offer(new Node3(1,1));
			//  		상 하 좌 우 
			int[] dx = {0,0,-1,1};
			int[] dy = {-1,1,0,0};
			//bfs
			while(!q.isEmpty()) {
				Node3 n = q.poll();
				if(n.x == x && n.y==y) {
					System.out.printf("#%d %d\n",N,1);
					continue out;
				}
				//사방탐색 
				for(int o = 0 ; o < 4 ; o++) {
					int mx = n.x + dx[o];
					int my = n.y + dy[o];
					if(box[my][mx]==1) continue;
					if(my<0 || my>=16 || mx < 0 || mx >=16 || box[my][mx]==0) continue;
					box[my][mx] =1;
					q.offer(new Node3(mx,my));
				}
				
			}
			System.out.printf("#%d %d\n",N,0);
		}//out
		
	}
}
class Node3{
	int x,y;
	public Node3(int x , int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
}
