package Algorithm;

public class 피보나치수열_보텀업_DP {
	public static long[] d = new long[100];
	public static void main(String[] args) {
		d[1]=1;
		d[2]=1;
		int n = 50; // 50번째 피보나치 수열 구하기
		
		//피보나치 구현
		for(int i = 3 ; i <= n; i++) {
			d[i]=d[i-2]+d[i-1];
		}
		System.out.println(d[n]);
	}
}
