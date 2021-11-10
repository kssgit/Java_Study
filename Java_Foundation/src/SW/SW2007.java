package SW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW2007 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		for(int i = 0 ; i < T ; i++) {
			String input = br.readLine();
			findPattern(input);
		}
		
	}
	static void findPattern(String input) {
		StringBuilder sb = new StringBuilder();
		// 문자열을 하나씩 쪼개며 확인 
		for(int i = 0 ; i < input.length(); i++) {
			sb.append(input.charAt(i));
			
		}
	}
}
