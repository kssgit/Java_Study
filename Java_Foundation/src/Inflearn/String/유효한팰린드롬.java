package Inflearn.String;

import java.util.*;

public class 유효한팰린드롬 {
	
	private static String solution(String st) {
		st = st.toUpperCase();
		String result = "YES";
		String[] array = st.split(" ");
		
		if(array.length %2 == 1) {
			result = "NO";
			return result;
		}
		
		for(int i = 0 ; i < array.length/2 ; i++) {
			String bf = array[i];
			String af = array[array.length -1 -i];
			int size = bf.length();
			if(bf.length() > af.length()) {
				size = af.length();
				bf = bf.substring(0,size);
			}else {
				af = af.substring(0,size);
			}
			for(int j = 0 ; j < size ; j++) {
				if(bf.charAt(j) != af.charAt(size-1-j)) return "NO";
			}
		}
		
		return result ;
	}
	
	//정답
	private static String solution2(String s){
		String answer="NO";
		s=s.toUpperCase().replaceAll("[^A-Z]", ""); // replaceAll에만 정규식 가능
		String tmp=new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer="YES";
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String st = sc.nextLine();
		System.out.println(solution(st));
	}
}
