package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class G4_1520_내리막길 {

	// 사방탐색용, 상 우 하 좌 순서
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	static int[][] arr,dp;

	static int M, N, count;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		count = 0; // 테스트케이스별로 count를 초기화시킨다.
		StringTokenizer st = new StringTokenizer(bf.readLine());
		M = Integer.parseInt(st.nextToken());// 세로크기
		N = Integer.parseInt(st.nextToken());// 가로크기
		arr = new int[M][N];
		dp = new int[M][N];
		Arrays.fill(dp, -1);
		for (int i = 0; i < M; i++) { // arr 채워주기
			StringTokenizer st1 = new StringTokenizer(bf.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st1.nextToken());
			}
		}
		bfs();
		System.out.println(count);
	}

	public static void bfs() { // 사방탐색으로 진행하면 되기 때문에 bfs를 사용한다.
		Queue<int[]> que = new LinkedList<>(); // 앞으로 갈 좌표를 저장할 queue를 생성한다.
		que.add(new int[] { 0, 0 }); // 처음 출발하는 곳인 0,0 을 추가한다.

		while (true) {
			if (que.isEmpty())
				break; // 큐가 비게되면 종료한다.
			int[] temp = que.poll(); // 큐에 들어온 순서대로 탐색해본다.
			int x = temp[0];
			int y = temp[1];

			if (x == M - 1 && y == N - 1) // (x,y)가 가장 오른쪽 아래칸에 도달하게 된다면 count 1 증가
				count++;

			for (int k = 0; k < 4; k++) { // 사방탐색
				int nx = x + dx[k];
				int ny = y + dy[k];
				// 만약 nx와 ny가 arr배열의 범위를 벗어나거나 오르막길, 평지라면 넘긴다.
				if (nx < 0 || ny < 0 || nx >= M || ny >= N || arr[x][y] <= arr[nx][ny]) {
					continue;
				} else { // 아니라면 좌표를 큐에 추가한다.
					que.add(new int[] { nx, ny });
				}

			}

		}

	}
}
