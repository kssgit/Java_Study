package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BJ2075_N번째큰수 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for(int r = 0 ; r < N ; r++) {
			st = new StringTokenizer(br.readLine());
			for(int w = 0 ; w < N ; w++) {
				pq.add(Integer.parseInt(st.nextToken()));
			}
		}
		
		int maxn = 0;
		for(int i = 0 ; i < N ; i++) {
			maxn = pq.poll();
		}
		System.out.println(maxn);
	}
}
