package Data_Structure;

import java.util.*;

public class 스텍 {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		//삽입 - push
		//추출 - pop
		//제일 상위 값- peek
		s.push(5);
		s.push(4);
		s.push(3);
		s.pop();
		s.push(1);
		s.pop();
		// stack 값 추출
		while(!s.empty()) {
			System.out.println(s.peek()+" ");
			s.pop();
			
		}
		
	}
}
