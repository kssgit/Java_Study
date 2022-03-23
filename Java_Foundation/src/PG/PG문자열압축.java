package PG;

import java.util.*;

public class PG문자열압축 {
	public static void main(String[] args) {
		String s = "ababcdcdababcdcd";
		System.out.println(solution(s));
	}
	private static int solution(String s) {
		int result = 0; 
		ArrayList<String> arr = new ArrayList<>();
		if(s.length() == 1) {//길이가 1이라면 압축할 수 있는 문자열이 없기 때문에 1 return 
			return 1;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1 ; i < s.length()/2+1 ; i++ ) {
			int count = 1;
			String sub = s.substring(i);
			for(int j = i+1; j < s.length() ; j=j+i) {
				String sub2 = s.substring(j,j+i);
				if(sub ==sub2) {
					count++;
				}else {
					if(count == 1) {
						sb.append("");
					}else {
						String c = Integer.toString(count);
						sb.append(c);
					}
					sb.append(sub);
					sub = s.substring(j,j+i);
					count =1;
					
				}
			}
			if(count == 1) {
				sb.append("");
			}else {		
				String c = Integer.toString(count);
				sb.append(c);
			}
			sb.append(sub);
			arr.add(sb.toString());
		}
		result = arr.get(0).length();
		for(int i = 1 ; i< arr.size(); i++) {
			if(result > arr.get(i).length()	) {
				result = arr.get(i).length();
			}
		}
		return result;
	}
}
