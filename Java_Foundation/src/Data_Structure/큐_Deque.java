package Data_Structure;

import java.util.ArrayDeque;
import java.util.Deque;

public class 큐_Deque {
	public static void main(String[] args) {
	
		/*
		 * Deque(덱 혹은 데크)은 Double-Ended Queue의 줄임말로 큐의 양쪽으로 
		 * 엘리먼트의 삽입과 삭제를 수행할 수 있는 자료구조를 의미한다.
		 */	
		System.out.println("Stack!!");
        Deque<String> stack = new ArrayDeque<>();
        stack.addFirst("Element1");
        stack.addFirst("Element2");
        stack.addFirst("Element3");
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        System.out.println(stack.removeFirst());
        
        System.out.println("Queue!!");
        Deque<String> queue = new ArrayDeque<>();
        queue.addFirst("Element1");
        queue.addFirst("Element2");
        queue.addFirst("Element3");
        System.out.println(queue.removeLast());
        System.out.println(queue.removeLast());
        System.out.println(queue.removeLast());
        
	}
}
