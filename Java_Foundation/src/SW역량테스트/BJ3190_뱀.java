package SW역량테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class BJ3190_뱀 {
	// 방향 전환 -> v <- ^
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int[][] board;
	static List<int[]> snake;
	static int N, K, L;
	static int[][] dir;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // 보드의 크기
		K = Integer.parseInt(br.readLine()); // 사과의 개수
		board = new int[N][N];
		for (int i = 0; i < K; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			board[r - 1][c - 1] = 1;
		}
		L = Integer.parseInt(br.readLine());// 방향 변환 횟수
		snake = new LinkedList<int[]>();// 뱀의 길이 및 위치 저장
		snake.add(new int[] { 0, 0 });
		dir = new int[L][2]; // 방향 변환 저장
		for (int i = 0; i < L; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			dir[i][0] = Integer.parseInt(st.nextToken());// 시간 저장
			char temp = st.nextToken().charAt(0);
			dir[i][1] = (temp == 'L') ? -1 : 1; // 왼쪽이면 -1 저장
		}
		System.out.println(solution());
	}

	static int solution() {
		int time = 0;
		int index = 0;
		int turn = 0;
		// 첫번째 방향 전환이 나올 때까지
		while (true) {
			time++;
			int[] sn = snake.get(snake.size() - 1).clone(); // clone을 이용해 복사 해야 주소값이 같아지지 않는다
			sn[0] += dy[index];
			sn[1] += dx[index];
			// 보드 밖으로 나가면 끝
			if (sn[0] < 0 || sn[0] >= N || sn[1] < 0 || sn[1] >= N)
				return time;
			// 뱀의 몸통과 만나면 끝
			for (int j = 0; j < snake.size(); j++) {
//					System.out.println(snake.get(j)[0] + " " +snake.get(j)[1] );
				if (sn[0] == snake.get(j)[0] && sn[1] == snake.get(j)[1])
					return time;
			}
			if (board[sn[0]][sn[1]] != 1) {
				snake.add(new int[] { sn[0], sn[1] });
				snake.remove(0); // 꼬리 짤라주기
			} else {
				snake.add(new int[] { sn[0], sn[1] });
				board[sn[0]][sn[1]] = 0;
			}
			if (turn < L) {
				if (dir[turn][0] == time) {
					index += dir[turn][1];
					turn++;
				}
			}
		}//while
	}
}
