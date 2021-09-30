package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;


class Toma {
	int x;
	int y;
	Toma(int x, int y) {
		this.x= x;
		this.y = y;
	}
}

public class BJ7576{
	static int M;
	static int N;
	static int[][] col;
	// 사방 탐색      상 하 좌 우
	static int[][] dxdy = {{-1,0},{1,0},{0,1},{0,-1}};
//	static Queue<Toma> xy = new LinkedList<Toma>();
	
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Toma> xy = new LinkedList<Toma>();
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int[][] col = new int[N][M];
		int day =0;
		
		for(int i = 0 ; i<N ; i++) {
			st =  new StringTokenizer(br.readLine());
			for(int j = 0; j<M ; j++) {
				col[i][j] = Integer.parseInt(st.nextToken());
				//익은 토마토의 좌표
				if(col[i][j]==1) {
					Toma t = new Toma(i,j);
					xy.add(t);
				}
			}
		}
		
		System.out.println(bfs(col,day,xy));
		
	}
	
	
	static int bfs(int[][] col,int day,Queue<Toma> xy) {
		int d = day;
		while(!xy.isEmpty()) {
			//탐색 길이 지정
			int l = xy.size();
			//사전에 입력된 queue가 빌때까지
			for(int k =0 ; k <l ; k++) {
				Toma tomato = xy.poll();
				//사방 탐색
				for(int i =0; i< dxdy.length;i++) {
					int x = tomato.x+dxdy[i][0];
					int y = tomato.y+dxdy[i][1];
					//박스를 넘어가지 않도록
					if(x<N && x>=0 && y <M && y>=0) {
						
						if(col[x][y] == 0) {
							Toma t = new Toma(x,y);
							xy.add(t);
							col[x][y] = 1;
						}
					}
				}
				/*
				 * for(int o = 0 ; o<N ; o++) {
				 * 
				 * for(int j = 0; j<M ; j++) {
				 * 
				 * System.out.print(col[o][j]); } System.out.println(); }
				 */
			}
//			System.out.println();
			d++;
		}
		//익지 않은 토마토 확인 
		for(int i = 0 ; i<N ; i++) {
			for(int j = 0; j<M ; j++) {
				if(col[i][j]==0) {
					return -1;
				}
			}
		}
		
		return d-1;
	}
	
	
}
