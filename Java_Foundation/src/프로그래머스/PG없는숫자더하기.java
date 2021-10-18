package 프로그래머스;

import java.util.Arrays;

public class PG없는숫자더하기 {
	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.println(s.solution(numbers));
		
	}
}
class Solution3 {
    public int solution(int[] numbers) {
        int answer = 0;
        for(int i = 0 ; i < 10 ;i++) {
        	for(int j = 0 ; j < numbers.length ; j++) {
        		if(i == numbers[j]) {
        			break;
        		}
        		if(j==numbers.length-1 && i!=numbers[j]){
        			answer+=i;
        		}
        	}

        	}
        return answer;
    }

}
