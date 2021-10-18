package test;

import java.util.Arrays;

public class code1 {
	public static void main(String[] args) {
//		Solution2 s2 = new Solution2();
		Solution1 s1 = new Solution1();
//		int[][] macaron = {{1,1},{2,1},{1,2},{3,3},{6,4},{3,1},{3,3},{3,3},{3,4},{2,1}};
//		System.out.println(s2.solution(macaron));
		String[] registered_list = {"card", "ace","ace13", "ace16", "banker", "ace17", "ace14"};
		String new_id = "ace13";
		System.out.println(s1.solution(registered_list, new_id));
		
	}
	
}

class Solution2 {
    public String[] solution(int[][] macaron) {
        String[] answer = {};
        int[][] box = new int[6][6];
        //박스에 마카롱 넣기 
        for(int i = 0 ; i<macaron.length ; i++) {
        	box[macaron[i][0]-1][5] = macaron[i][1];
        }
        //박스에서 깊이 탐색을 해 같은 마카롱 삭제 함수 
        
        //박스에서 사라진 마카롱 자리에 위에있는 마카롱 넣기 
        
        return answer;
    }
}

class Solution1 {
	static String[] registered_list;
	static String new_id;
    public String solution(String[] registered_list, String new_id) {
        String answer = "";
        this.registered_list = registered_list;
        this.new_id = new_id;
        while(true) { // registered_list에 같은 아이디가 없을 때까지 반복 
        	if(!Arrays.stream(registered_list).anyMatch(new_id::equals)) {
        		//아이디가 없을 경우 현재 아이디 리턴
        		return new_id;
        	}//if
        	// 아이디 분해 
        	StringBuilder S = new StringBuilder();;
        	for(int i = 0 ; i< new_id.length();i++) {
        		Character a = new_id.charAt(i);
        		if(a.isDigit(a)) {
        			break;
        		}
        		S.append(a);
        	}
        	
        	String N = new_id.replaceAll("[^\\d]","");
        	int N2 = 0;
        	if(N.equals("")) {
        		N2+=1;
        	}else {
        		N2= Integer.parseInt(N);
        		N2+=1;
        	}
        	String N3 =Integer.toString(N2);
        	if(N.equals("")) {
        		S.append(N3);
        	}else{
        		S.append(N3);
        		new_id =S.toString();
        	}
        	
        }//while
    }//solution
}