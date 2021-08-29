package Work;

import java.util.Scanner;
import java.util.Stack;

public class BJ17608_막대기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		Stack<Integer> stack = new Stack<>();

		for(int i =0 ; i < T ;i++) {
			int N = sc.nextInt();
			stack.add(N);
		}
		

		int count =1;
		int m = stack.pop();

		int size = stack.size();

		for(int i=0 ; i <size;i++) {

			int n = stack.pop();

			if (n>m) {
				m =n;
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
