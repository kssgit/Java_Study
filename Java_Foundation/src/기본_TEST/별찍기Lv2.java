package 기본_TEST;

import java.util.Scanner;

public class 별찍기Lv2 {
	public static void main(String[] args) {
		// *
		// **
		// ***
		// ****
		// *****
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = N; j > i + 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// -----------다른 사람 풀이
		char[] stars = new char[N];
		StringBuffer res = new StringBuffer();
		for (int i = 0; i < N; i++) {
			stars[i] = ' ';
		}
		for (int i = 0; i < N; i++) {
			stars[N - i - 1] = '*';
			res.append(stars).append('\n');
		}
		System.out.println(res.toString());
	}
}
