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
				if(stack.empty()) {
					stack.push(s);
				}else if(s == '(' || s == '[' || s=='{'||s=='<'){
					stack.push(s);
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
			if(stack.empty()) {
				System.out.printf("#%d %d\n",i,1);
			}else {
				System.out.printf("#%d %d\n",i,0);
			}
		}//out
	}
}
