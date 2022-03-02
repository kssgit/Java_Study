package Inflearn;

public class 다시보기_모르는함수 {
	public static void main(String[] args) {
		// 문자열
		String st = "avb";
		char c = 'a';
		st.toUpperCase();// 모든 문자열 대문자 변환 String
		st.toLowerCase();// 모든 문자열 소문자 변환 String
		c = Character.toUpperCase(c); // 대문자 변환 char
		c = Character.toLowerCase(c); // 소문자 변환 char
		st.toCharArray();//문자열을 문자 배열로 변환 array
		Character.isLowerCase(c);//해당 문자가 소문자인지 확인 boolean 
		
	}
}
