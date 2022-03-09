package Inflearn.String;

import java.util.*;

public class 암호 {
	private static String solution(int n , String st) {
		String result = "";
		
		for(int i = 0 ; i < n ; i++) {
			String a = st.substring(0,7).replace("#", "1").replace("*", "0");
			int num  = Integer.parseInt(a,2);
			result+=(char)num;
			st = st.substring(7);
		}
		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String st = sc.next();
		System.out.println(solution(num, st));
		
	}
}
