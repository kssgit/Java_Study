package SW역량테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SW7733_치즈도둑 {
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static int[][] box ;
	static int count , N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			box = new int[N][N];
			count = 0;
			int max_day = 0;
			int min_day = 101;
			for(int j = 0 ; j < N ; j++) {
				String input = br.readLine();
				for(int k = 0 ; k < N ; k++) {
					box[j][k] = input.charAt(k)-'0';
					max_day = Math.max(max_day, box[j][k]);
					min_day = Math.min(min_day, box[j][k]);
				}	
			}
			for(int j = min_day ; j < max_day ; j++) {
				Node4 n = found(j);
				if(n==null) break;
				int max =bfs(j, n);
				count = Math.max(max, count);
			}
			System.out.printf("#%d %d\n",i+1,count);
		}//out
	}
	static int bfs(int day, Node4 n) {
		int cheese = 0;
		
		
		
		return 0;
	}
	static Node4 found(int day) {
		Node4 n;
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				if(box[i][j] != day && box[i][j] != 0) {
					n = new Node4(j, i);
					return n;
				}
			}
		}
		return null;

	}
}
class Node4{
	int x, y;
	public Node4(int x, int y) {
		this.x = x;
		this.y = y;
	}
}