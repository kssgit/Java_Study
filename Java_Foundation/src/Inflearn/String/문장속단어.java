package Inflearn.String;


import java.util.Scanner;


public class 문장속단어 {
	private static String solution(String str) {
		
		String[] array = str.split(" ");
		String result = "";
		
		for(String s : array) {
			if(s.length() > result.length()) {
				result = s;
			}
		}
		
		return	result;
	}
	
	
	//indexOf ,subString
	private static String solution1(String str) {
		
		String[] array = str.split(" ");
		String result = "";
		int m = Integer.MIN_VALUE , pos ;
		while((pos = str.indexOf(' ')) != -1) {// 공백을 발견하는 index 반환(-1은 문자열이 끝날때 나오는 값)
			String tmp = str.substring(0,pos);
			if(tmp.length() > m ) {
				m = tmp.length();
				result = tmp;
			}
			str = str.substring(pos+1);
		}
		if(str.length() > m ) result=str;
		
		return	result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println(solution(st));
	}
}
