package 기본_TEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 별찍기Lv3 {
	public static void main(String[] args) throws IOException {
//		*****
//		****
//		***
//		**
//		*
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = N ; j > i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
