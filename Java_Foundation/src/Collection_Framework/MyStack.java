package Collection_Framework;

import java.util.*;

public class MyStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		//���� - push
		//���� - pop
		//�ֻ�� ���� ��� - peek
		s.push(5);
		s.push(4);
		s.push(3);
		s.pop();
		s.push(1);
		s.pop();
		// ������ �ֻ�� ���Һ��� ���
		while(!s.empty()) {
			System.out.println(s.peek()+" ");
			s.pop();
			
		}
		
	}
}
