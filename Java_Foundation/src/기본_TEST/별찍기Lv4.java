package 기본_TEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class 별찍기Lv4 {
	public static void main(String[] args) throws IOException{
//		*****
//		 ****
//		  ***
//		   **
//		    *
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		char[] c = new char[N];
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < N ; i++) {
			c[i] = '*';
		}
		for(int i = 0 ; i < N ; i++) {
			sb.append(c).append("\n");
			c[i]=' ';
		}
		System.out.println(sb.toString());
	}
}
