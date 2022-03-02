package Inflearn;

import java.util.Scanner;


public class 문자찾기 {
	public static void main(String[] args){
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		Scanner sc = new Scanner(System.in);
		String word = sc.next().toLowerCase();
		Character c = sc.next().toLowerCase().charAt(0);
		int result = 0;
		for(int i = 0 ; i < word.length() ; i++) {
			if(c == word.charAt(i)) {
				result++;
			}
		}
		System.out.println(result);
	}
}
