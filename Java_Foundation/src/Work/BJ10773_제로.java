package Work;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ10773_제로{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		test 수 입력
		int T = Integer.parseInt(br.readLine());
//		Stack 선언
		Stack<Integer> s = new Stack<Integer>();
//		stack에 값 넣기
		for(int i = 0 ; i < T;i++) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0) {
				s.pop();
			}else {
				s.push(a);
			}
		}
//		stack 값 더하기
		int sum = 0;
		int size = s.size();
		for(int i = 0 ; i < size;i++) {
			sum+=s.pop();
		}
		System.out.println(sum);
		
	}
}
