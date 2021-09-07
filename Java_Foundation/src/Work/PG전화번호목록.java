package Work;

import java.util.HashMap;

public class PG전화번호목록 {
	public static void main(String[] args) {
		String[] phone_book = {"119", "97674223", "1195524421"};
		Solution s = new Solution();
		System.out.println(s.solution(phone_book));
	}
	
}
 class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap< String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0 ; i < phone_book.length ; i++)
        	map.put(phone_book[i], i);
        
        for(int i = 0 ; i<phone_book.length;i++) {
        	for(int k = 1 ; k<phone_book[i].length();k++) {
        		if(map.containsKey(phone_book[i].substring(0,k))) {
        			answer =false;
        			return answer;
        		}
        	}
        }
        
        return answer;
    }
}