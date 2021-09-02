package Work;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class PG다리를지나는트럭 {
	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		System.out.println(solution(bridge_length, weight, truck_weights));
	}
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Deque<Integer> queue = new LinkedList<>();
        int 무게총합 = 0;
        for(int w : truck_weights) {
        	// 마지막 트럭을 제외한 모든 트럭을 통과시키기 위한 무한 반복
	        while(true) {
	        	//큐가 비어있을 경우
	        	if(queue.isEmpty()) {
	        		queue.offer(w);
	        		무게총합 +=w;
	        		answer++;
	        		break;
	        	//큐의 크기가 다리 크기와 같을 경우
	        	}else if(queue.size() == bridge_length) {
	        		무게총합 -=queue.poll();
	        	//큐의 크기가 다리크기보다 작을 경우
	        	}else {
	        		
	        		if(무게총합 + w > weight) {
	        			queue.offer(0);
	        			answer++;
	        		}else {
	        			queue.offer(w);
	        			무게총합 +=w;
	        			answer++;
	        			break;
	        		}
	        	}
	        }
        }
        
        return answer+bridge_length;
    }
}

