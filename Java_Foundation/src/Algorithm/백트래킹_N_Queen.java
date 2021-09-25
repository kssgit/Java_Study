package Algorithm;

import java.util.Scanner;

public class 백트래킹_N_Queen {
	/* 백트래킹이란 
	 * 재귀적으로 문제를 하나씩 풀어나가되 현재 재귀를 통해 확인 중인 상태(노드)가 
	 * 제한 조건에 위배되는지(유망하지 않은지) 판단하고 
	 * 그러한 경우 해당 상태(노드)를 제외하고 다음 단계로 나아가는 방식
	 * 즉, 이 방법을 통해 우리는 모든 경우의 수를 체크 하지 않고 
	 * 필요한 것만 체크하여 전체 풀이 시간을 단축할 수 있게 된다!
	 */
	// 백트래킹 대표적인 알고리즘 중 DFS 가 있다
	
	//대표문제 N-Queen
	/*
	 * 크기가 N * N 인 체스판 위에 퀸 N 개를 서로 공격할 수 없게 놓는 문제이다.
	 * N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.
	 */
	
	//핵심
	//이 문제를 자세히 들여다 보면 하나의 줄에는 하나의 퀸만 존재한다는 것을 알 수 있습니다.

	static int col[]; // i 행에 들어갈 퀸의 좌표  
    static int n;
    static int ans; // 경우의 수 
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 첫번째 퀸의 시작점은 행을 기준. (i = 1) => (1, 1), (i = 2) => (1, 2), (i = 3) => (1, 3)
            col = new int[n];
            col[0] = i;
            // 1. DFS 수행 (다음 열인 2열 이동)
            back_tracking(1);
        }

        // 정답 출력
        System.out.println(ans);
        
    }

    static void back_tracking(int row) {
    	if(row==n) {
    		ans++;
    		for(int i = 0 ; i < col.length ; i++) {
            	System.out.print(col[i]);
            }
    		System.out.println();
    	}else {
    		for(int i = 0 ; i < n ; i++) {
    			col[row]=i; // 좌표 추가
    			// 좌표를 먼저 추가를 해야 퀸이 놓일 수 있는지 isPosible 에서 확인이 가능함
    			if(isPosible(row)) {// 해당 좌표에 퀸이 놓일 수 있다면 좌표를 추가를 하고 넘어감
    				back_tracking(row+1);// 다음 행으로 넘어감
    			}
    		}
    	}
    	
    }
    
    static boolean isPosible(int row) {
    	 for(int i=0;i<row;i++){
    	        //level 위치에 현재 시험할 퀸이 놓여져 있는 상태이고
    	        //우리는 그 퀸과 i= 0 ~ level-1 에 놓여있는 퀸이 문제를 일으키는지만 보면 된다.
    	         
    	        if(col[i]==col[row] || Math.abs(row-i)== Math.abs(col[row]-col[i])){
    	            //i번째 퀸의 위치와 level위치의 퀸이 같은 일직선상에 있는경우(열이 같을 경우)
    	            //또는
    	            //i번째 퀸의 위치와 level위치의 퀸이 대각선상에 있는 경우.
    	            //밑변과 높이가 같으면 대각선상에 있다고 볼수 있다.
    	            return false;
    	            //이 경우는 불가능 하므로 false를 리턴
    	        }
    	    }
    	    return true;
    	    //위의 경우를 제외하면 가능하므로 true 리턴
    }
}
