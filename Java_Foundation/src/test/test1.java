package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class test1 {
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		System.out.println(Arrays.asList(solution(id_list, report, k)).toString());
	}
	private static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Integer> map = new HashMap<String, Integer>();//신고 건수 저장 
        Map<String, ArrayList<String> > save = new HashMap<>();//신고자 저장
        // 1 신고
        for(int i = 0 ; i < report.length ; i++) {
        	String[] arr = report[i].split(" ");
        	if(map.get(arr[1]) != null && !save.get(arr[1]).contains(arr[i])) {
        		// 한유저를 한번만 신고 했다면 횟수+1
        		map.put(arr[1], map.get(arr[1])+1);
        		ArrayList<String> add = save.get(arr[1]);
        		add.add(arr[0]);
        		save.put(arr[1], add);
        	}
        }
        System.out.println(map.toString());
        System.out.println(save.toString());
        for(int i = 0 ; i < id_list.length ; i++) {
        	//1. 해당 유저가 정지될지 않될지 판단
        	if(map.get(id_list[i]) >= k) {
        		for(int j = 0 ; j < save.get(id_list[i]).size(); j++) {
        			int index = Arrays.asList(id_list).indexOf(save.get(id_list[i]).get(j));
        			answer[index] +=1;
        		}
        		
        	}
        }
        
        return answer;
    }
}
