package Inflearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 다시보기_모르는함수 {
	public static void main(String[] args) {
		// 문자열
		String st = "avb";
		char c = 'a';
		st.toUpperCase();// 모든 문자열 대문자 변환 String
		st.toLowerCase();// 모든 문자열 소문자 변환 String
		c = Character.toUpperCase(c); // 대문자 변환 char
		c = Character.toLowerCase(c); // 소문자 변환 char
		Character.isAlphabetic('a');// 해당 문자가 알파벳인지 아닌지 확인 
		st.toCharArray();//문자열을 문자 배열로 변환 array
		Character.isLowerCase(c);//해당 문자가 소문자인지 확인 boolean 
		Character.isDigit(c); // 해당 문자가 숫자인지 확인 boolean
		st.toUpperCase().replaceAll("[^A-Z]", ""); // 대문자를 제외하고 모두 대체 ( replaceAll 은 정규식 가능)
		String tmp=new StringBuilder("asdf").reverse().toString(); // 해당 문자를 뒤집어서 반환
		int num = Integer.parseInt("10001",2);// 2진수 숫자 변환
		char a = (char)num; // 아스키코드 문자열 변환
		
		//Array
		String[] id_list = {}; 
		String[] report = {};
		List<String> list = Arrays.stream(report).distinct().collect(Collectors.toList());// 해당 배열의 중복 제거
		list.stream().collect(Collectors.toList());// 해당 array의 중복 값 제거
		
		//Map
		 Map<String, Integer> map = new HashMap<>();
		 map.getOrDefault("key 값", 0);//key 값에 해당하는 값이 없다면 기본값 0 출력
	}

}
