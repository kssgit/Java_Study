package Work;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class PG주식가격 {
	public static void main(String[] args) {
		int[] prices = {1, 2, 3, 2, 3};
		System.out.println(Arrays.toString(solution(prices))); 
	}
	public static int[] solution(int[] prices) {
        int[] answer=new int[prices.length];
        for(int i = 0 ; i < prices.length ; i++) {
        	int a = prices[i];
        	int se = 0;
        	if(i == prices.length-1) {
        		answer[i]=0;
        		break;
        	}
        	for(int j = i+1 ; j<prices.length; j++) {
        		if(a<=prices[j]) se++;
        		else{
        			se++;
        			break;
        		}
        	}
        	answer[i] = se;
        }
        return answer;
    }
}
