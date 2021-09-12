package Work;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW7236 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0 ; i < T ; i++) {
			int S = Integer.parseInt(br.readLine());
			char[][] M = new char[S][S];
			for(int j = 0 ; j < S ; j++) {
//				String[] s = br.readLine().split(" ");
				StringTokenizer token = new StringTokenizer(br.readLine());
				for(int k = 0 ; k < S ;k++ ) {
					M[j][k] = token.nextToken().charAt(0);
				}
			}//2차원 배열 받기
//			System.out.println(Arrays.deepToString(map));	//2차원 배열 확인하는법
//			System.out.println(Arrays.toString(a)); 일차원 배열 확인하는법
			// 상 하 좌 우 좌상 우상 좌하 우하
			int[] dx = {0,0,-1,1,-1,1,-1,1};
			int[] dy = {-1, 1, 0,0,-1,-1,1,1};
			int max = 0;
			for(int j = 0 ; j < S ; j++) {
				for(int k = 0 ; k < S; k++) {
					if(M[j][k]=='W') {
						//8방 탐색
						int count =0;

						for(int l = 0 ; l <8 ;l++) {
							//범위 지정
							if(j+dx[l]>=0 && j+dx[l]<S && k+dy[l]>=0 && k+dy[l]<S) {
								if(M[j+dx[l]][k+dy[l]]=='W') {
									count++;
								}
							}
						}
						if(count>max) {
							max = count;
						}
					}
				}
			}
			if(max == 0) {
				max =1;
			}
			System.out.printf("#%d %d\n",i+1,max);
		
			
		}//out
	}
	
}
