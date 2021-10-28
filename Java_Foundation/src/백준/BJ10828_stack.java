package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ10828_stack {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N  = Integer.parseInt(st.nextToken());
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0 ; i <N ; i++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			switch(order) {
			case "push":
				int n = Integer.parseInt(st.nextToken());
				stack.push(n);
				break;
			case "pop":
				if(stack.empty()) {
					System.out.println(-1);
					break;
				}
				int p = stack.pop();
				System.out.println(p);
				break;
			case "size":
				int s = stack.size();
				System.out.println(s);
				break;
			case "empty":
				if(stack.empty()) {
					System.out.println(1);
					break;
				}else {
					System.out.println(0);
					break;
				}
			case "top":
				if(stack.empty()) {
					System.out.println(-1);
					break;
				}
				System.out.println(stack.peek());
				break;
			}
		}
		
	}
}
