package SW역량테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BJ14499_주사위굴리기 {
	static int N , M , x, y, K;
	static int[][] map;
	static int[] sero = new int[4];
	static int[] garo = new int[4];
	static int[] dy = {1,-1,0,0};
	static int[] dx = {0,0,-1,1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());// 세로 크기 
		M = Integer.parseInt(st.nextToken());// 가로 크기
		x = Integer.parseInt(st.nextToken());// 주사위 좌표
		y = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());// 명령 개수
		map = new int[N][M];
		for(int i = 0 ; i < N ; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < M ; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//주사위 바닥에 시작위치 값 넣기
		//세로 가로 1(윗면),3(아랫면)은 같아야 한다 
		sero[3]=map[x][y];// 북 남
		garo[3]=map[x][y];// 동 서
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < K ; i++) {
			int dir = Integer.parseInt(st.nextToken())-1;
			int mx = x+dx[dir];
			int my = y+dy[dir];
			if(mx < 0 || mx >=N || my<0 || my>=M ) continue;
			move(dir);
//			System.out.println(Arrays.toString(garo));
//			System.out.println(Arrays.toString(sero)); 
			if(map[mx][my] !=0) {
				sero[3] = map[mx][my];
				garo[3] = map[mx][my];
				map[mx][my]=0;
			}else {
				map[mx][my] = sero[3];
				
			}
//			System.out.println("dir : "+dir);
//			System.out.println(Arrays.toString(garo));
//			System.out.println(Arrays.toString(sero)); 
			x=mx;
			y=my;
			System.out.println(sero[1]);
		}
		
		
	}
	static void move(int dir) {
		switch (dir){
		case 0: // 동
			int eg = garo[3];
			for(int i = 3 ; i > 0 ; i--) {
				garo[i] = garo[i-1];
			}
			garo[0] = eg;
			sero[1] = garo[1];
			sero[3] = garo[3];
			break;
		case 1:// 서
			int wg = garo[0];
			for(int i = 0 ; i < 3 ; i++) {
				garo[i] = garo[i+1];
			}
			garo[3] = wg;
			sero[1] = garo[1];
			sero[3] = garo[3];
			break;
		case 2:// 북
			int ns =sero[0];
			for(int i = 0 ; i < 3 ; i++) {
				sero[i] = sero[i+1];
			}
			sero[3] = ns;
			garo[1] = sero[1];
			garo[3] = sero[3];
			break;
		case 3:// 남
			int ss = sero[3];
			for(int i = 3 ; i > 0 ; i--) {
				sero[i] = sero[i-1];
			}
			sero[0] = ss;
//			System.out.println(Arrays.toString(sero));
			garo[1] = sero[1];
			garo[3] = sero[3];
			break;
		}
	}
}
