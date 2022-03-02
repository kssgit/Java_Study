package Inflearn;

import java.util.Scanner;

public class 단어뒤집기 {
	private static String solution(String st) {
		StringBuffer result  = new StringBuffer();
		for(int i = st.length() -1 ; i >= 0 ; i-- ) {
			result.append(st.charAt(i));
		}
		
		return result.toString();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N ; i ++ ) {
			System.out.println(solution(sc.next()));
		}
		
	}
}
