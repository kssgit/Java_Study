package Work;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
//		�Է¹޴� io ��ü Scanner 
		Scanner sc = new Scanner(System.in);
//		Stack�� ���� �Է� �ޱ�
		int T = sc.nextInt();
//		Stack ����
		Stack<Integer> stack = new Stack<>();
//		Stack�� �� �ֱ�
		for(int i =0 ; i < T ;i++) {
			int N = sc.nextInt();
			stack.add(N);
		}
		
//		��ó�� ���̴� ���밡 �ֱ� ������ 1���� ����
		int count =1;
//		��ó�� ���� ���̸� �����ؼ� ���� m�� ����
//		ū����� ���� 
		int m = stack.pop();
//		stack�� ���̸� size ������ �����Ѵ�
		int size = stack.size();
//		size��ŭ for���� ���鼭 Stack�� ���� �ϳ��� �� n�� ����
		for(int i=0 ; i <size;i++) {
//			n�� m�� �񱳸��ϱ����� ������� ���� 
			int n = stack.pop();
//			n�� m���� Ŭ��� m�� n�� ���� �� count ����
			if (n>m) {
//				
				m =n;
				count++;
			}
		}
		System.out.println(count);
//		io��ü�� �ݵ�� class�� ������ ���� �ݾ��ش�
		sc.close();
	}
}
