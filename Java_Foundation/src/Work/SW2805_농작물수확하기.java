package Work;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SW2805_농작물수확하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		test 수 입력
		int T = Integer.parseInt(br.readLine());

		
		for(int i = 0 ; i<T ; i++ ) {
			int N = Integer.parseInt(br.readLine());
			int[][] a = new int[N][N];
//			배열 입력
			for(int j = 0 ; j < N ; j++) {
				String str = br.readLine();
				for(int k = 0 ; k < N ; k++) {
//					문자열을 하나씩 int 형으로 변환
					a[j][k] = str.charAt(k)-'0';

				}
			}

//			알고리즘 시작 
			int m = (int)N/2; // 행 , 열  중간 index 값
			int sum = 0;
			for(int j = 0 ; j < N; j ++) {
				System.out.printf("중앙 열 값 a[%d][%d] =%d\n",j,m,a[j][m]);
				if (j < m) { // 중앙 행 이전 값

					int m_sum = a[j][m];
					for(int k = 1 ; k < j+1 ; k++) {
						m_sum +=a[j][m+k];
						m_sum +=a[j][m-k];
					}
					sum +=m_sum;
				} else if (j == m) { // 중앙 행 값
					for(int k = 0 ; k <N ;k++) {
						sum +=a[j][k];
					}
				}else { // 중앙 행 이후 값 
					int m_sum = a[j][m];
					for(int k = 1 ; k < N-j ; k++) {
						m_sum +=a[j][m+k];
						m_sum +=a[j][m-k];
					}
					sum +=m_sum;
				}
			}
			System.out.printf("#%d %d\n",i+1,sum);
		}
	}
}
