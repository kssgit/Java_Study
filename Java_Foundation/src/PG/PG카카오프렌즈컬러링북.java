package PG;

import java.util.*;

//좌표 저장을 위한 class
	class XY{
		int x,y;
		XY(int y, int x	){
			this.x = x ;
			this.y = y;
		}
	}

public class PG카카오프렌즈컬러링북 {
	private static int[] solution(int m, int n, int[][] picture) {
	        int numberOfArea = 0;
	        int maxSizeOfOneArea = 0;
	        
	        int[][] xy = {{-1,0},{1,0},{0,1},{0,-1}};
	        
	        //1. for문으로 0이 아닌 값들을 찾는다
	        for(int y = 0 ; y < m ; y++) {
	        	for(int x = 0 ; x < n ; x++ ) {
	        		//2. 0이 아닌 값을 찾으면 그 부분부터 그값과 일치하는 영역을 사방탐색으로 찾는다 BFS
	        		if(picture[y][x] > 0 ) {
	        			numberOfArea++;
	        			int area = 1;
	        			int start = picture[y][x]; 
	        			Queue<XY> queue = new LinkedList<XY>();
	        			queue.add(new XY(y, x));
	        			picture[y][x] = 0;
	        			
	        			while(!queue.isEmpty()) {
	        				XY where = queue.poll();
	        				for(int i = 0 ; i < xy.length ; i++) {
	        					int h = where.y + xy[i][0];
	        					int w = where.x + xy[i][1];
	        					if(h>=0 && h < m && w >=0 && w <n && picture[h][w] == start	) {
	        						area++;
	        						picture[h][w] = 0;
	        						queue.add(new XY(h, w));
	        					}
	        				}
	        				
	        			}
	        			
	        			//	탐색이 끝나면 해당 결과의 최대값 비교 후 결과 값에 담는다
	        			if(area > maxSizeOfOneArea) {
	        				maxSizeOfOneArea = area;
	        			}
	        		}
	        	}
	        	
	        }
	        
	        int[] answer = new int[2];
	        answer[0] = numberOfArea;
	        answer[1] = maxSizeOfOneArea;
	        return answer;
	}
	
	
	 
	public static void main(String[] args) {
		int[][] picture = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
		int m = 6;
		int n = 4;
		for(int x : solution(m, n, picture)) {
			System.out.println(x);
		}
	}
}
