package Inflearn;

import java.util.Scanner;
import java.util.Stack;

public class 특정문자뒤집기 {
	//내풀이 
	private static String solution(String st) {
		String result = "";
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0 ; i < st.length(); i++) {
			if((st.charAt(i) >= 65 && st.charAt(i)<=95) || (st.charAt(i) >= 97 && st.charAt(i) <= 122) ) {
				stack.push(st.charAt(i));
			}
		}
		for(int i = 0 ; i < st.length(); i++) {
			if((st.charAt(i) >= 65 && st.charAt(i)<=95) || (st.charAt(i) >= 97 && st.charAt(i) <= 122) ) {
				result += stack.pop();
			}else {
				result += st.charAt(i);
			}
		}
		
		return result;
	}
	
	//Character.isAlphabetic을 사용 및 치완 방법을 사용한 뒤집기
	private static String solution2(String str){
		String answer;
		char[] s=str.toCharArray();
		int lt=0, rt=str.length()-1;
		while(lt<rt){
			if(!Character.isAlphabetic(s[lt])) lt++;
			else if(!Character.isAlphabetic(s[rt])) rt--;
			else{
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
		}
		answer=String.valueOf(s);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println(solution(st));
	}
}
