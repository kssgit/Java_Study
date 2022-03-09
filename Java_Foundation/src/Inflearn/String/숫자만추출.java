package Inflearn.String;

import java.util.*;

public class 숫자만추출 {
	private static int solution(String st) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < st.length() ; i++) {
			if(Character.isAlphabetic(st.charAt(i))) continue;
			sb.append(st.charAt(i));
		}
		int result = Integer.parseInt(sb.toString());
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		System.out.println(solution(st));
	}
}
