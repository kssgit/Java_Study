package PG;

public class PG문자열압축 {
	public static void main(String[] args) {
		String s = "ababcdcdababcdcd";
		System.out.println(solution(s));
	}
	private static int solution(String s) {
		int result = 0; 
		if(s.length() == 1) {//길이가 1이라면 압축할 수 있는 문자열이 없기 때문에 1 return 
			return 1;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 1 ; i < s.length()/2+1 ; i++ ) {
			int count = 1;
			String sub = s.substring(i);
			for(int j = i+1; j < s.length() ; j=j+i) {
				String sub2 = s.substring(j,j+i);
//				if(sub =)
			}
		}
		
		return result;
	}
}
