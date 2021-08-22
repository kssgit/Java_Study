package Work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ10773{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		Stack<Integer> s = new Stack<Integer>();

		for(int i = 0 ; i < T;i++) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0) {
				s.pop();
			}else {
				s.push(a);
			}
		}

		int sum = 0;
		int size = s.size();
		for(int i = 0 ; i < size;i++) {
			sum+=s.pop();
		}
		System.out.println(sum);
		
	}
}
