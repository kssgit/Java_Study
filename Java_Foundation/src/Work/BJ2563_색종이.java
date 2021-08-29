package Work;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class BJ2563_색종이 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//가로 100 세로 100 배열 선언
		int[][] Coordi =new int[100][100]; 
		//값이 1인 좌표의 개수
		int sum = 0;
		int T = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < T ; i ++) {
			StringTokenizer token = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(token.nextToken()); 
			int y = Integer.parseInt(token.nextToken());
			//주어진 좌표에서 정사각형안에 1 값 넣기
			for(int j = x ;j <x+10;j++) {
				for(int k = y; k < y+10 ; k++) {
					//값이 0인 좌표만 1 삽입
					if(Coordi[j][k] == 0) {
						Coordi[j][k] =1;
						sum++;
					}
				}
			}
		}
		System.out.println(sum);
	}
}
