package Inflearn;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {
	//내 풀이
	private static String solution(String st) {
		StringBuffer result  = new StringBuffer();
		for(int i = st.length() -1 ; i >= 0 ; i-- ) {
			result.append(st.charAt(i));
		}
		
		return result.toString();
	}
	
	//내장함수를 이용한 뒤집기 
	private static ArrayList<String> solution2(int n, String[] str){
		ArrayList<String> answer=new ArrayList<>(); 
		for(String x : str){
			String tmp=new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}
	
	// 문자 하나하나 변경
	private static ArrayList<String> solution3(int n, String[] str){
		ArrayList<String> answer=new ArrayList<>(); 
		for(String x : str){
			char[] s=x.toCharArray();
			int lt=0, rt=x.length()-1;
			while(lt<rt){
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp=String.valueOf(s);
			answer.add(tmp);
		}
		return answer;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0 ; i < N ; i ++ ) {
			System.out.println(solution(sc.next()));
		}
		
	}
}
