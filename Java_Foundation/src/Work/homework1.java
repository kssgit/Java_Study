package Work;

import java.util.*;

public class homework1 {
	public static void main(String[] args){
//	소금 쟁이 문제 
		Scanner scanner = new Scanner(System.in);
		System.out.println("T를 입력하세요");
		int t = scanner.nextInt();
		for(int i=1 ;i <=t ;i++) {
			System.out.println("배열의 크기 N:");
			int n = scanner.nextInt();
			System.out.println("소금 쟁이의 수 :");
			int s = scanner.nextInt();
			int maxs = s;
//			배열의 크기에 맞는 2차원 배열 선언 및 초기화
			int[][] N = new int[n][n];
//			System.out.println(N[4][4]);
//			상하좌우 이동을 담은 배열 
			int[][] d = {{-1,0},{1,0},{0,-1},{0,1}};
//			소금쟁이의 수에 맞게 반복문 수행
			for(int j=0; j < maxs ;j++) {
				System.out.println("x 좌표:");
				int x = scanner.nextInt();
				System.out.println("y 좌표:");
				int y = scanner.nextInt();
				int[] start = {x,y};
				System.out.println("방향을 입력 하세요:");
				int w = scanner.nextInt();
				boolean loop = true;
				switch(w) {
				case 1: //상
					int[] ux = d[w-1];
					for(int k = 3 ; k >0 ; k--) {
						start[0] +=(ux[0]*k);
//						범위를 벗어나거나 다른 소금쟁이가 머물러 있으면 죽는다
						if(start[0]<0 || start[0]>=n || N[start[0]][start[1]]==1) {
							s--;
							loop = false;
							break;
						}					
					}
//					안전하게 도착 할 경우 좌표에 1추가
					if(loop) {
						N[start[0]][start[1]] =1;
					}
					break;
				case 2: // 하
					int[] dx = d[w-1];
					for(int k = 3 ; k >0 ; k--) {
						start[0] +=(dx[0]*k);
//						범위를 벗어나거나 다른 소금쟁이가 머물러 있으면 죽는다
						if(start[0]<0 || start[0]>=n || N[start[0]][start[1]]==1) {
							s--;
							loop = false;
							break;
						}					
					}
//					안전하게 도착 할 경우 좌표에 1추가
					if(loop) {
						N[start[0]][start[1]] =1;
					}
					break;
				case 3: // 좌
					int[] ly = d[w-1];
					for(int k = 3 ; k >0 ; k--) {
						start[1] +=(ly[1]*k);
//						범위를 벗어나거나 다른 소금쟁이가 머물러 있으면 죽는다
						if(start[1]<0 || start[1]>=n || N[start[0]][start[1]]==1) {
							s--;
							loop = false;
							break;
						}					
					}
//					안전하게 도착 할 경우 좌표에 1추가
					if(loop) {
						N[start[0]][start[1]] =1;
					}
					break;
				case 4:// 우
					int[] ry = d[w-1];
					for(int k = 3 ; k >0 ; k--) {
						start[1] +=(ry[1]*k);
//						범위를 벗어나거나 다른 소금쟁이가 머물러 있으면 죽는다
						if(start[1]<0 || start[1]>=n || N[start[0]][start[1]]==1) {
							s--;
							loop = false;
							break;
						}					
					}
//					안전하게 도착 할 경우 좌표에 1추가
					if(loop) {
						N[start[0]][start[1]] =1;
					}
					break;
				}
			}//inner
			System.out.println("#"+i+" "+s);
		}//outer
		
	}
}
