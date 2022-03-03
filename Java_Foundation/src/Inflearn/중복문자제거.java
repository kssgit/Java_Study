package Inflearn;

import java.util.*;

public class 중복문자제거 {
	private static String solution(String st) {
		
		String result = "";
		result += st.charAt(0);
		for(int i = 1 ; i < st.length() ; i++ ) {
			if(result.indexOf(st.charAt(i)) != -1) continue;
			result += st.charAt(i);
		}
		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		
		System.out.println(solution(st));
		
	}
}
