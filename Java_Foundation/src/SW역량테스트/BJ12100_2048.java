package SW역량테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ12100_2048 {
	static int max;
	static int N;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int[][] box = new int[N][N];
		max =0;
		for(int i = 0 ; i < N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			for(int j = 0 ; j < N ; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
				if(max < box[i][j])max=box[i][j];
			}
		}
		solution(box,0);
		System.out.println(max);
	}
	
	public static void solution(int[][] box , int count){
		if(count == 5) return;
		solution(up(box),count+1);
		solution(down(box),count+1);
		solution(left(box),count+1);
		solution(right(box),count+1);
	}
	//위로 이동
	public static int[][] up(int[][] box){
		int[][] result = new int[N][N];
		boolean flag = true;//한번에 여러개의 값들이 더해지지 않도록
		Stack<Integer> s = new Stack<>();
		for(int j = 0 ; j < N ; j++) {
			for(int i = 0 ; i < N ; i++) {
				if(box[i][j]!=0) {
					if(s.isEmpty())s.add(box[i][j]);
					else {
						if(s.peek() == box[i][j] && flag ) {
							s.add(s.pop()+box[i][j]);
							flag=false;
							if(s.peek() > max) max=s.peek();
							continue;
						}
						else s.add(box[i][j]);
					}
					flag=true;
				}//out-if
			}//in-for
			
			while(!s.isEmpty()) {
				int i = s.size()-1;
				result[i][j] = s.pop();
			}
		}//out-for
 		
		
		return result;
	}
	//아래로 이동
	public static int[][] down(int[][] box){
		int[][] result = new int[N][N];
		boolean flag = true;//한번에 여러개의 값들이 더해지지 않도록
		Stack<Integer> s = new Stack<>();
		for(int j = 0 ; j < N ; j++) {
			for(int i = N-1 ; i >= 0 ; i--) {
				if(box[i][j]!=0) {
					if(s.isEmpty())s.add(box[i][j]);
					else {
						if(s.peek() == box[i][j] && flag ) {
							s.add(s.pop()+box[i][j]);
							flag=false;
							if(s.peek() > max) max=s.peek();
							continue;
						}
						else s.add(box[i][j]);
					}
					flag=true;
				}//out-if
			}//in-for
			
			while(!s.isEmpty()) {
				int i = N -s.size();
				result[i][j] = s.pop();
			}
		}//out-for
		
		
		return result;
	}
	//왼쪽으로 이동
	public static int[][] left(int[][] box){
		int[][] result = new int[N][N];
		boolean flag = true;//한번에 여러개의 값들이 더해지지 않도록
		Stack<Integer> s = new Stack<>();
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < N ; j++) {
				if(box[i][j]!=0) {
					if(s.isEmpty())s.add(box[i][j]);
					else {
						if(s.peek() == box[i][j] && flag ) {
							s.add(s.pop()+box[i][j]);
							flag=false;
							if(s.peek() > max) max=s.peek();
							continue;
						}
						else s.add(box[i][j]);
					}
					flag=true;
				}//out-if
			}//in-for
			
			while(!s.isEmpty()) {
				int j = s.size()-1;
				result[i][j] = s.pop();
			}
		}//out-for
		
		
		return result;
	}
	//오른쪽으로 이동
	public static int[][] right(int[][] box){
		int[][] result = new int[N][N];
		boolean flag = true;//한번에 여러개의 값들이 더해지지 않도록
		Stack<Integer> s = new Stack<>();
		for(int i = 0 ; i < N ; i++) {
			for(int j = N-1 ; j >= 0 ; j--) {
				if(box[i][j]!=0) {
					if(s.isEmpty())s.add(box[i][j]);
					else {
						if(s.peek() == box[i][j] && flag ) {
							s.add(s.pop()+box[i][j]);
							flag=false;
							if(s.peek() > max) max=s.peek();
							continue;
						}
						else s.add(box[i][j]);
					}
					flag=true;
				}//out-if
			}//in-for
			
			while(!s.isEmpty()) {
				int j = N -s.size();
				result[i][j] = s.pop();
			}
		}//out-for
		
		
		return result;
	}
}
