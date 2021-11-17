package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ4963_섬의개수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//            상 하 좌 우 좌상 좌하 우상 우하
		int[] bw = { 0, 0, -1, 1, -1, -1, 1, 1};
		int[] bh = { -1, 1, 0, 0, -1, 1, -1, 1};
		
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			//끝나는 조건
			if(w == 0 && h == 0) {
				break;
			}
			//box 선언
			int[][] box = new int[h][w];
			//box에 값 넣기
			for(int i = 0 ; i < h ; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0 ; j <w ; j++) {
					box[i][j]=Integer.parseInt(st.nextToken());
				}
			}//for
			//섬의 개수
			int count = 0;
			// 탐색
			for(int i = 0 ; i< h ;i++) {
				for(int j = 0 ; j <w ; j++) {
					//값이 1이면
					if(box[i][j]==1) {
						//bfs
						count++;
						Queue<Land> q = new LinkedList<Land>();
						q.offer(new Land(j,i));
						while(!q.isEmpty()) {
							Land l = q.poll();
							//팔방 탐색
							for(int k = 0 ; k < 8 ;k++) {
								int mw = l.x + bw[k];
								int mh = l.y + bh[k];
								if(mw>=0 && mw<w && mh>=0 && mh<h && box[mh][mw]==1) {
									//방문처리
									box[mh][mw] =0;
									q.offer(new Land(mw, mh));
								}
							}
						}
						
					}
				}//for-in
			}//for-out
			
			System.out.println(count);
			
			
		}//while
		
	}
}
class Land{
	int x;
	int y;
	public Land(int x , int y) {
		this.x = x;
		this.y = y;
	}
}

