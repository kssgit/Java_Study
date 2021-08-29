package Work;

import java.util.*;

public class 소금쟁이 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=1 ;i <=t ;i++) {

			int n = scanner.nextInt();

			int s = scanner.nextInt();
			int maxs = s;

			int[][] N = new int[n][n];

			int[][] d = {{-1,0},{1,0},{0,-1},{0,1}};

			for(int j=0; j < maxs ;j++) {

				int x = scanner.nextInt();

				int y = scanner.nextInt();
				int[] start = {x,y};
				int w = scanner.nextInt();
				boolean loop = true;
				switch(w) {
				case 1: //up
					int[] ux = d[w-1];
					for(int k = 3 ; k >0 ; k--) {

						if(start[0]<0 || start[0]>=n || N[start[0]][start[1]]==1) {
							s--;
							loop = false;
							break;
						}					
					}

					if(loop) {
						N[start[0]][start[1]] =1;
					}
					break;
				case 2: //down
					int[] dx = d[w-1];
					for(int k = 3 ; k >0 ; k--) {
						start[0] +=(dx[0]*k);

						if(start[0]<0 || start[0]>=n || N[start[0]][start[1]]==1) {
							s--;
							loop = false;
							break;
						}					
					}

					if(loop) {
						N[start[0]][start[1]] =1;
					}
					break;
				case 3: // left
					int[] ly = d[w-1];
					for(int k = 3 ; k >0 ; k--) {
						start[1] +=(ly[1]*k);

						if(start[1]<0 || start[1]>=n || N[start[0]][start[1]]==1) {
							s--;
							loop = false;
							break;
						}					
					}

					if(loop) {
						N[start[0]][start[1]] =1;
					}
					break;
				case 4:// right
					int[] ry = d[w-1];
					for(int k = 3 ; k >0 ; k--) {
						start[1] +=(ry[1]*k);

						if(start[1]<0 || start[1]>=n || N[start[0]][start[1]]==1) {
							s--;
							loop = false;
							break;
						}					
					}

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
