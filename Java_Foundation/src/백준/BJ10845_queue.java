package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ10845_queue {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N  = Integer.parseInt(st.nextToken());
		
		
		Queue<Integer> queue = new LinkedList<Integer>();
		int last = 0;
		for(int i = 0 ; i <N ; i++) {
			st = new StringTokenizer(br.readLine());
			String order = st.nextToken();
			switch(order) {
			case "push":
				int n = Integer.parseInt(st.nextToken());
				queue.add(n);
				last = n;
				break;
			case "pop":
				if(queue.isEmpty()) {
					System.out.println(-1);
					break;
				}
				int p = queue.poll();
				System.out.println(p);
				break;
			case "size":
				int s = queue.size();
				System.out.println(s);
				break;
			case "empty":
				if(queue.isEmpty()) {
					System.out.println(1);
					break;
				}else {
					System.out.println(0);
					break;
				}
			case "front":
				if(queue.isEmpty()) {
					System.out.println(-1);
					break;
				}
				System.out.println(queue.peek());
				break;
			case "back":
				if(queue.isEmpty()) {
					System.out.println(-1);
					break;
				}
				System.out.println(last);
				break;
			}
		}
	}
}
