package 백준;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class 간선{
	int a;
	int b;
	public 간선(int a , int b) {
		this.a =a;
		this.b = b;
	}
}


public class BJ1260 {
	//BFS
	static Queue<간선> queue = new LinkedList<간선>();
	//DFS
	static ArrayList<간선> stack = new ArrayList<간선>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		//결과 값
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0 ; i < M ; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			간선 t = new 간선(a, b);
			queue.add(t);
			stack.add(t);
		}
		
	}
	
	static void BFS(ArrayList<Integer> result,int start) {
		
	}
	
	static void DFS(ArrayList<Integer> result,int start) {
		
	}
}

