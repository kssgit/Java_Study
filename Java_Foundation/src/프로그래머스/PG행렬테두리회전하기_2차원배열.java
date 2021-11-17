package 프로그래머스;

import java.util.Arrays;

public class PG행렬테두리회전하기_2차원배열 {
	public static void main(String[] args) {
		PG행렬테두리회전하기_2차원배열 pg = new PG행렬테두리회전하기_2차원배열();
		int rows =6;
		int columns = 6;
		int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		for(int a :pg.solution(rows, columns, queries))
			System.out.println(a);
	}
	
	int[][] box;
	public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        // 박스 만들기 
         this.box = new int[rows][columns];
        int number = 1;
        for(int r = 0 ; r < rows ; r++) {
        	for(int c = 0 ; c < columns ; c++) {
        		box[r][c] = number;
        		number++;
        	}
        }
        
        //
        
        for(int i = 0 ; i < queries.length ; i++) {
        	answer[i] = rota(queries[i]);
        }
        
        
        return answer;
    }
	
	int rota(int[] querie) {
		int r1 = querie[0]-1;
		int c1 = querie[1]-1;
		int r2 = querie[2]-1;
		int c2 = querie[3]-1;
		int min = box[r1][c1];
		int temp = box[r1][c1];
		//위로
		for(int i =r1; i<r2; i++) {
			min = Math.min(min, box[i][c1]);
			this.box[i][c1] = this.box[i+1][c1];
		}
		//<-
		for(int i =c1; i<c2; i++) {
			min = Math.min(min, box[r2][i]);
			this.box[r2][i] = this.box[r2][i+1];
		}
		//아래
		for(int i =r2; i>r1; i--) {
			min = Math.min(min, box[i][c2]);
			this.box[i][c2] = this.box[i-1][c2];
		}
		for(int i = c2 ; i>c1 ; i--) {
			min = Math.min(min, box[r1][i]);
			this.box[r1][i] = this.box[r1][i-1];
		}
		this.box[r1][c1+1] = temp;
		//System.out.println(Arrays.deepToString(box));
		
		return min;
		
	}
	
	
}
