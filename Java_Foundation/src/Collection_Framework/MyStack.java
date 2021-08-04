package Collection_Framework;

import java.util.*;

public class MyStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		//삽입 - push
		//추출 - pop
		//최상단 원소 출력 - peek
		s.push(5);
		s.push(4);
		s.push(3);
		s.pop();
		s.push(1);
		s.pop();
		// 스택의 최상단 원소부터 출력
		while(!s.empty()) {
			System.out.println(s.peek()+" ");
			s.pop();
			
		}
		
	}
}
