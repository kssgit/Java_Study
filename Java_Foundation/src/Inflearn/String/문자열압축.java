package Inflearn.String;

import java.util.*;

public class 문자열압축 {
	private static String solution(String st) {
		
		StringBuilder sb = new StringBuilder();
		char c = st.charAt(0);
		sb.append(c);
		int a =1;
		for(int i = 1 ; i < st.length(); i++) {
			if(c == st.charAt(i)) {
				a++;
			}else {
				if(a>1) {
					sb.append(a);
				}
				sb.append(st.charAt(i));
				c = st.charAt(i);
				a=1;
			}
		}
		if(a>1) {
			sb.append(a);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		
		System.out.println(solution(st));
	}
}
