package Work;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SW2805_���۹���Ȯ�ϱ� {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		test �� �Է�
		int T = Integer.parseInt(br.readLine());

		
		for(int i = 0 ; i<T ; i++ ) {
			int N = Integer.parseInt(br.readLine());
			int[][] a = new int[N][N];
//			�迭 �Է�
			for(int j = 0 ; j < N ; j++) {
				String str = br.readLine();
				for(int k = 0 ; k < N ; k++) {
//					���ڿ��� �ϳ��� int ������ ��ȯ
					a[j][k] = str.charAt(k)-'0';

				}
			}

//			�˰��� ���� 
			int m = (int)N/2; // �� , ��  �߰� index ��
			int sum = 0;
			for(int j = 0 ; j < N; j ++) {
				System.out.printf("�߾� �� �� a[%d][%d] =%d\n",j,m,a[j][m]);
				if (j < m) { // �߾� �� ���� ��

					int m_sum = a[j][m];
					for(int k = 1 ; k < j+1 ; k++) {
						m_sum +=a[j][m+k];
						m_sum +=a[j][m-k];
					}
					sum +=m_sum;
				} else if (j == m) { // �߾� �� ��
					for(int k = 0 ; k <N ;k++) {
						sum +=a[j][k];
					}
				}else { // �߾� �� ���� �� 
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
