package Work;


import java.util.Arrays;
import java.util.Scanner;


public class SW2001 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 1 ; i <= T ; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int [][] map = new int[N][N];
			for(int j = 0 ; j < N ; j++) {
				for(int k = 0 ; k < N ;k++ ) {
					map[j][k] = sc.nextInt();
				}
			}//2차원 배열 받기
//			System.out.println(Arrays.deepToString(map));	//2차원 배열 확인하는법
			//요소별 탐색
			int max = 0;
			for(int j = 0 ; j < N ; j++) {
				for(int k = 0 ; k < N ; k++) {
					int sum = 0;
					//범위 지정
					if(j+M-1<N && k+M-1<N) {
						for(int q = j ; q<= j+M-1 ;q++) {
							for(int w = k ; w<= k+M-1 ; w++ ) {
								sum+=map[q][w];
							}
						}
						if(sum >max) {
							max = sum;
						}
					}
				}
			}
			System.out.printf("#%d %d\n",i,max);
		}//out
	}
}
