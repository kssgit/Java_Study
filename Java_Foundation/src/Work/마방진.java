package Work;

import java.util.Scanner;

public class 마방진 {
	public static void main(String[] args) {
		/*
		 * 마방진 홀수 : 3 (키보드 입력) 
		 * 08 01 06 
		 * 03 05 07 
		 * 04 09 02 
		 * 알아서 마방진 
		 * 적용 
		 * 0 행 1 열 에 값 1 
		 * 2 행 2 열 에 값 2 
		 * 1 행 0 열 에 값 3 
		 * -------------- 
		 * 2 행 0 열 에 값 4 
		 * 1 행 1 열 에 값 5 
		 * 0 행 2 열 에 값 6 
		 * --------------- 
		 * 1 행 2 열 에 값 7 
		 * 0 행 0 열 에 값 8 
		 * 2 행 1 열 에 값 9 
		 * 시작은 [0]행
		 * [입력값의/2]열 부터 시작 한다. 행은 1씩 감소 열은 1씩 증가 열은 최대, 입력값의 -1 까지만 증가 되고 다시 0이 된다 행은
		 * 0까지만 감소 되고 다시 입력값의 -1 된다. 마방진 값이 입력값의 배수가 되면 열은 바뀌지 않고 행만 1증가한다. 마방진 값은 쵀대
		 * (입력값 * 입력값) 까지만 증가한다.
		 */

				Scanner sc= new Scanner(System.in);
				System.out.print("홀수 값을 입력하세요 ");
				int n = sc.nextInt();

				int[][] magic=new int[n][n];

				int count = 1;

				int j = n/2;

				int i = 0;

				while(count <= (n*n)) { // 마방진 값은 쵀대 (입력값 * 입력값) 까지만 증가한다.
					int multi=count%n; 

					magic[i][j]=count;// 값 넣기

					if(multi == 0) { 
						i++;         // 마방진 값이 입력값의 배수면 행만 증가하고 열은 그대로 행만 1증가

					}else {		
						if(i == 0) {  // 행은 0까지만 감소하고 다시 입력값의 -1 이 된다.
							i=n-1;
						}else {
							i--; // 행은 1씩 감소한다.
						}

						if( j == n-1 ) { // 열은 입력값의-1 까지만 증가하고 다시 0이 된다.
							j = 0;
						}else {
							j++;      //열은 1씩 증가한다.
						}
					}
					count++;
				}//while

				for(int h = 0 ; h < magic.length ; h++) {

					for(int k = 0 ; k < magic[h].length ; k++) {

						System.out.print( magic[h][k] + " ");

					}//inner

					System.out.println();
				}//outer
	}
}
