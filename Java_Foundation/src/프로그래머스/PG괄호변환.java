package 프로그래머스;

import java.util.Stack;

public class PG괄호변환 {
	static PG괄호변환 pg = new PG괄호변환();
	public static void main(String[] args) {
		
		String p = "(()())()";
		System.out.println(pg.solution(p));
		
	}
	public String solution(String p) {
        String answer = "";
        
		/*
		 * 1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다. 
		 * 2. 문자열 w를 두 "균형잡힌 괄호 문자열" u, v로 분리합니다. 단, u는 "균형잡힌 괄호 문자열"로 더 이상 분리할 수 없어야 하며, v는 빈 문자열이 될 수 있습니다. 
		 * 3. 문자열 u가 "올바른 괄호 문자열"이라면 문자열 v에 대해 1단계부터 다시 수행합니다. 
		 * 	3-1. 수행한 결과 문자열을 u에 이어 붙인 후 반환합니다. 
		 * 4. 문자열 u가"올바른 괄호 문자열"이 아니라면 아래 과정을 수행합니다. 
		 * 	4-1. 빈 문자열에 첫 번째 문자로 '('를 붙입니다. 
		 * 	4-2. 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙입니다. 
		 * 	4-3. ')'를 다시 붙입니다. 
		 * 	4-4. u의 첫 번째와 마지막 문자를제거하고, 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙입니다. 
		 * 	4-5. 생성된 문자열을 반환합니다.
		 */        
        //1. 입력이 빈 문자열인 경우, 빈 문자열을 반환합니다. 
        if(p.equals(""))
        	return "";
        if(check(p)) {
        	return p;
        }else {
        	return split(p);
        }
        
   
    }
	public boolean check(String p) {
		int open =0;
		if(p.charAt(0) == ')') return false;
		for(int i = 0 ; i < p.length(); i++) {
			if(p.charAt(i) == '(') open++;
			else {
				open--;
				if(open<0) return false;
			}
			
		}
		return true;
	}
	public String split(String p) {
		// 1. 입력된 문자열 w를 u와 v로 나누어 저장하는 StringBuilder클래스 객체.
		StringBuilder u  = new StringBuilder();
		StringBuilder v  = new StringBuilder();
		// 3. (의 개수를 저장하는 변수.
		int open = 0;
		for(int i = 0 ; i < p.length();i++) {
			// 4. 한 문자가 (인 경우 open은 증가.
			if(p.charAt(i) == '(') open++;
			// 5. )인 경우 open은 감소.
			else open--;
			// 6. 처음 open이 0이 된 경우가 가장 작은 단위의 "균형잡힌 괄호 문자열".
			if(open==0) {
				// 7. 해당 인덱스를 기점으로 u와 v로 분리.
				u.append(p.substring(0,i+1));
				v.append(p.substring(i+1,p.length()));
				// 8. u가 "올바른 괄호 문자열"이라면,
				if(check(u.toString())) {
					// 9. v에 대해 재귀호출 후, u에 이어 붙인다. 이 과정 후 break에 걸려 u를 반환하므로 변환 과정에 성립.
					u.append(split(v.toString()));
				// 10. u가 "올바른 괄호 문자열"이 아니라면,  
				}else {
					// 11. 새로운 StringBuilder 객체 생성.
					StringBuilder str  = new StringBuilder();
					// 12. (를 붙인다.
					str.append('(');
					// 13. v에 대해 재귀호출 후 붙인다.
                    str.append(split(v.toString()));
                    // 14. )를 붙인다.
                    str.append(')');
                    // 15. u를 조작해 붙인다.
                    str.append(reverse(u.toString()));
                    // 16. 새로운 문자열을 반환한다.
                    return str.toString();
				}
				break;
			}
				
		}
		
		// 17. u가 올바른 문자인 경우에만 반환되는 u.
        return u.toString();
	}
	public String reverse(String u) {
		StringBuilder ru = new StringBuilder();
		for(int i = 1 ; i < u.length()-1;i++) {
			if(u.charAt(i)=='(') ru.append(')');
			else ru.append('(');
		}
		
		
		return ru.toString();
	}
}
