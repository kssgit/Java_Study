package Recursive_Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class b17478 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"");
		
		int n = Integer.parseInt(st.nextToken());
		System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
		System.out.println("\"����Լ��� ������?\"");
		System.out.println("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		String a = "____";
		recurs(n,a);
		System.out.println("��� �亯�Ͽ���.");
		
	}
	public static void recurs(int N,String a) {
		if(N==1) {
			System.out.println(a+"\"����Լ��� ������?\"");
			System.out.println(a+"\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
			System.out.println(a+"��� �亯�Ͽ���.");
			return;
		}
		String b = "____";
		System.out.println(a+"\"����Լ��� ������?\"");
		System.out.println(a+"\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		System.out.println(a+"���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		System.out.println(a+"���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
		N--;
		String c = a+b;
		recurs(N,c);
		System.out.println(a+"��� �亯�Ͽ���.");
		
	}
}
