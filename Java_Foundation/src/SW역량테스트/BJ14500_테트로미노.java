package SW역량테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ14500_테트로미노 {
	static int N, M, max;
	static int[][] paper;
	// 상 하 좌 우
	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		paper = new int[N][M];
		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		// 탐색
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				visited[i][j] = true;
				dfs(i, j, paper[i][j], 1);
				visited[i][j] = false;// 다시 방문해야 하기 때문에
				// ㅜ 만 따로 탐색
				search(i, j, paper[i][j]);
			}
		}
		System.out.println(max);

	}

	static void dfs(int y, int x, int sum, int length) {
		// 깊이가 4이면 종료
		if (length >= 4) {
			max = Math.max(sum, max);
			return;
		}
		// 4방 탐색
		for (int i = 0; i < 4; i++) {
			int my = y + dy[i];
			int mx = x + dx[i];
			// 종이를 넘어가면 넘어간다
			if (my < 0 || my >= N || mx < 0 || mx >= M)
				continue;
			if (visited[my][mx] == false) {
				visited[my][mx] = true;
				dfs(my, mx, sum + paper[my][mx], length + 1);
				visited[my][mx] = false;
			}
		}

	}

	static void search(int y, int x, int sum) {
		if (y + 1 < N && x + 2 < M) {
			int s = sum + paper[y][x + 1] + paper[y][x + 2] + paper[y + 1][x + 1];
			max = Math.max(s, max);
		}
		if (y + 2 < N && x + 1 < M) {
			int s = sum + paper[y + 1][x] + paper[y + 2][x] + paper[y + 1][x + 1];
			max = Math.max(s, max);
		}
		if (y - 1 >= 0 && x + 2 < M) {
			int s = sum + paper[y][x + 1] + paper[y][x + 2] + paper[y - 1][x + 1];
			max = Math.max(s, max);
		}
		if (y + 1 < N && y - 1 >= 0 && x + 1 < M) {
			int s = sum + paper[y][x + 1] + paper[y - 1][x + 1] + paper[y + 1][x + 1];
			max = Math.max(s, max);
		}
	}

}
