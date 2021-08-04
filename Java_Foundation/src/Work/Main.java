package Work;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
//		입력받는 io 객체 Scanner 
		Scanner sc = new Scanner(System.in);
//		Stack의 길이 입력 받기
		int T = sc.nextInt();
//		Stack 생성
		Stack<Integer> stack = new Stack<>();
//		Stack에 값 넣기
		for(int i =0 ; i < T ;i++) {
			int N = sc.nextInt();
			stack.add(N);
		}
		
//		맨처음 보이는 막대가 있기 때문에 1부터 시작
		int count =1;
//		맨처음 막대 길이를 추출해서 변수 m에 저장
//		큰수담는 변수 
		int m = stack.pop();
//		stack의 길이를 size 변수에 저장한다
		int size = stack.size();
//		size만큼 for문을 돌면서 Stack의 값을 하나씩 빼 n에 저장
		for(int i=0 ; i <size;i++) {
//			n은 m과 비교를하기위해 만들어진 변수 
			int n = stack.pop();
//			n이 m보다 클경우 m에 n을 저장 후 count 증가
			if (n>m) {
//				
				m =n;
				count++;
			}
		}
		System.out.println(count);
//		io객체는 반드시 class가 끝나기 전에 닫아준다
		sc.close();
	}
}
