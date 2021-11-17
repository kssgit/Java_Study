package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class BJ7662_이중우선순위큐 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine());
		
		int T = Integer.parseInt(st.nextToken());
		for(int t = 0 ; t < T ;t++) {
			st = new StringTokenizer(br.readLine());
			TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();  
			
			int Q = Integer.parseInt(st.nextToken());
			for(int q = 0 ; q < Q ; q++) {
				st = new StringTokenizer(br.readLine());
				char o = st.nextToken().charAt(0);
				int n = Integer.parseInt(st.nextToken());
				switch(o) {
				//삽입
				case 'I':
					tmap.put(n, tmap.getOrDefault(n, 0) + 1); // 같은 키값이 있으면 vlaue +1 없으면 1
					break;
				//삭제
				case 'D':
					if(tmap.isEmpty()) continue;
					//최솟값 
					if(n==-1) {
						int min = tmap.firstKey();
						if(tmap.getOrDefault(min, 0)==1) {
							tmap.remove(min);
						}else {
							tmap.put(min, tmap.getOrDefault(min, 0)-1);
						}
					//최댓값
					}else {
						int max = tmap.lastKey();
						if(tmap.getOrDefault(max, 0)==1) {
							tmap.remove(max);
						}else {
							tmap.put(max, tmap.getOrDefault(max, 0)-1);
						}
					}
					break;
				}//switch
				
			}//in for 
			if(tmap.isEmpty()) System.out.println("EMPTY");
			else System.out.printf("%d %d\n",tmap.lastKey() , tmap.firstKey());
		}//out for 
		
	}

	
}
