package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;



public class BJ1260_DFS_BFS {

	public static void main(String[] args) throws Exception {
		
		ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		//결과 값
		int[] visit = new int[N];
		
		graph.add(new ArrayList<Integer>());
		for(int i = 0 ; i < N ; i++) {
			graph.add(new ArrayList<Integer>());
		}
		//graph 생성
		for(int i = 0 ; i < M ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph.get(a).add(b);
			graph.get(b).add(a);
		}
		//graph 정렬
		for(int i = 0 ; i < graph.size();i++) {
			Collections.sort(graph.get(i));
		}
		
		//인접리스트/graph 출력
       for(int i=0; i<=N; i++) {
            Iterator<Integer> iter = graph.get(i).iterator();
            System.out.print("[" + i + "]: ");
             
            while(iter.hasNext()) {
                System.out.print(iter.next() + " ");
            }
            System.out.println();
        }
       //
       int[] check = new int[N+1];
       DFS(graph,S,check);
       
       System.out.println();
       
       BFS(graph,S,N);
        
        
      
        
	}
	
	//큐 너비 탐색 
	static void BFS(ArrayList<ArrayList<Integer>> graph,int start,int N) {
		int[] visit = new int[N+1];
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 0 ; i < graph.get(start).size();i++) {
			queue.add(graph.get(start).get(i));
		}
		visit[start] = 1; // 방문 확인 배열 
		System.out.print(start+" ");
		
		while(!queue.isEmpty()) { // 
			int size = queue.size();
			for(int i = 0 ; i < size ;i++) {
				int node = queue.poll();
				if(visit[node]==0) {
					visit[node] = 1;
					System.out.print(node+" ");
					for(int j = 0 ; j < graph.get(node).size();j++) {
						int nods = graph.get(node).get(j);
						if(visit[nods]==0) {
							queue.add(nods);
						}
					}
				}
			}
		}
		
	}
	
	//재귀 깊이 탐색 
	static void DFS(ArrayList<ArrayList<Integer>> graph,int start,int[] check) {
		
		if(check[start]==1) {
			return;
		}
		check[start]=1;
		System.out.print(start+" ");
		for(int i = 0 ; i < graph.get(start).size(); i++) {
			int next_Start = graph.get(start).get(i);
			DFS(graph,next_Start,check);
		}
	}
	
}

