package SW;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SW2007 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		for(int i = 1 ; i <= T ; i++) {
			String input = br.readLine();
			for(int j = 1 ; j < input.length(); j++) {
				String a = input.substring(0,j);
				String b = input.substring(j,j+j);
				if(a.equals(b)) {
					System.out.printf("#%d %d",i,a.length());
					System.out.println();
					break;
				}
			}
		}
		
	}
}
