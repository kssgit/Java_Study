package Work;

import java.util.Scanner;
import java.util.Stack;

public class SW1218 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for(int i = 1 ; i <=T ;i++) {
			Stack<Character> stack = new Stack<Character>();
			int lan = sc.nextInt();
			String st = sc.next();
			for(int j = 0 ; j < lan ; j++) {
				char s = st.charAt(j);
				//stack 이 비어있을 경우 추가
				if(stack.empty()) { 
					stack.push(s);
				// 여는괄호는 추가
				}else if(s == '(' || s == '[' || s=='{'||s=='<'){
					stack.push(s);
				//닫힌 괄호만 비교한다.
				}else if(s == ')') {
					if(stack.peek() == '(') {
						stack.pop();
					}else {
						stack.push(s);
					}
				}else if(s == ']') {
					if(stack.peek() == '[') {
						stack.pop();
					}else {
						stack.push(s);
					}
				}else if(s == '}') {
					if(stack.peek() == '{') {
						stack.pop();
					}else {
						stack.push(s);
					}
				}else if(s == '>') {
					if(stack.peek() == '<') {
						stack.pop();
					}else {
						stack.push(s);
					}
				}
				
			}
			//stack 확인 후 결과값 출력
			if(stack.empty()) {
				System.out.printf("#%d %d\n",i,1);
			}else {
				System.out.printf("#%d %d\n",i,0);
			}
		}//out
	}
}
