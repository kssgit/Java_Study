package Inflearn.String;

import java.util.*;

public class 회문문자열 {
	
	private static String solution(String st) {
		st = st.toUpperCase();
		int size = st.length()/2;//절반만
		String result = "YES";
		for(int i = 0 ; i < size ; i++) {
			if(st.charAt(i) != st.charAt(st.length()-1-i)) result = "NO";
		}
		
		return result ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String st = sc.next();
		System.out.println(solution(st));
	}
}
