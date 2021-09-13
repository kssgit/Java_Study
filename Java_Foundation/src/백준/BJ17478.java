package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ17478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"");
		
		int n = Integer.parseInt(st.nextToken());
		System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
		System.out.println("\"재귀함수가 뭔가요?\"");
		System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
		System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
		System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
		String a = "____";
		recurs(n,a);
		System.out.println("라고 답변하였지.");
		
	}
	public static void recurs(int N,String a) {
		if(N==1) {
			System.out.println(a+"\"재귀함수가 뭔가요?\"");
			System.out.println(a+"\"재귀함수는 자기 자신을 호출하는 함수라네\"");
			System.out.println(a+"라고 답변하였지.");
			return;
		}
		String b = "____";
		System.out.println(a+"\"재귀함수가 뭔가요?\"");
		System.out.println(a+"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
		System.out.println(a+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
		System.out.println(a+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
		N--;
		String c = a+b;
		recurs(N,c);
		System.out.println(a+"라고 답변하였지.");
		
	}
}
