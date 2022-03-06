package Inflearn.String;

import java.util.Scanner;

public class 대소문자변환 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] st = sc.next().split("");
		StringBuilder result = new StringBuilder(); 
		for(int i = 0 ; i < st.length ; i++) {
			if(Character.isUpperCase(st[i].charAt(0))) { // 대문자이면
				
				result.append(st[i].toLowerCase().charAt(0));
			}else {
				result.append(st[i].toUpperCase().charAt(0));
			}
		}
		System.out.println(result.toString());
	}
}
