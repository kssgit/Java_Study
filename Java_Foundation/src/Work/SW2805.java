package Work;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SW2805 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0 ; i<T ; i++ ) {
			int N = Integer.parseInt(br.readLine());
			int[][] a = new int[N][N];
			for(int j = 0 ; j < N ; j++) {
				String str = br.readLine();
				for(int k = 0 ; k < N ; k++) {
					a[j][k] = str.charAt(k)-'0';
				}
			}
			//가운데 값 
			int m = (int)N/2; 
			int sum = 0;
			
			for(int j = 0 ; j < N; j ++) {
				//j는 행 
				if (j < m) { 

					int m_sum = a[j][m];

					for(int k = 1 ; k < j+1 ; k++) {
						m_sum +=a[j][m+k];
						m_sum +=a[j][m-k];
					}//in
					sum +=m_sum;
				} else if (j == m) { // 가운데 값
					for(int k = 0 ; k <N ;k++) {
						sum +=a[j][k];
					}//in
				}else { 
					int m_sum = a[j][m];
					for(int k = 1 ; k < N-j ; k++) {
						m_sum +=a[j][m+k];
						m_sum +=a[j][m-k];
					}//in
					sum +=m_sum;
				}
			}//out
			System.out.printf("#%d %d\n",i+1,sum);
		}
	}
}
