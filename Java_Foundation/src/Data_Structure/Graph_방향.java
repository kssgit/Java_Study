package Data_Structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Graph_방향 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         
         
	        // vertex의 개수 : 노드
	        int vCnt = Integer.parseInt(sc.next());
	        // edge의 개수 : 간선
	        int eCnt = Integer.parseInt(sc.next());
	         
	         
	         
	        ArrayList<ArrayList<Integer>> adList = new ArrayList<>();
	        // 리스트 인덱스 '1'로 하기에 dummy data로 한 개 넣어둠
	        adList.add(new<Integer> ArrayList());
	        //각 노드마다 초기화
	        for(int i=0; i<vCnt; i++) {
	            adList.add(new<Integer> ArrayList());
	        }
	         
	        for(int i=0;i<eCnt;i++) {
	            int v1 = sc.nextInt();
	            int v2 = sc.nextInt();
	             
	            adList.get(v1).add(v2);
	        }
	         
	        //인접리스트 출력
	        for(int i=1; i<=vCnt; i++) {
	            Iterator<Integer> iter = adList.get(i).iterator();
	            System.out.print("[" + i + "]: ");
	             
	            while(iter.hasNext()) {
	                System.out.print(iter.next() + " ");
	            }
	            System.out.println();
	        }
	}
}
