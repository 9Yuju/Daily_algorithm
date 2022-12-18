package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S2_1260_DFS와BFS {
	static int N, M, V;
	static int[][] adjMatrix;
	static StringBuilder sb;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken()); // 정점의 개수
		M = Integer.parseInt(st.nextToken()); // 간선의 개수
		V = Integer.parseInt(st.nextToken()); // 시작할 정점의 번호
		adjMatrix = new int[N + 1][N + 1]; // 정점이 1부터
		sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			StringTokenizer st1 = new StringTokenizer(bf.readLine());
			int x = Integer.parseInt(st1.nextToken());
			int y = Integer.parseInt(st1.nextToken());
			adjMatrix[x][y] = adjMatrix[y][x]= 1;
		}
		
		dfs(new boolean[N + 1], V);
		sb.append("\n");
		bfs(V);
		System.out.println(sb);
	}

	public static void dfs(boolean[] visited, int current) {
		visited[current] = true;
		sb.append(current).append(" ");

		for (int i = 1; i <= N; i++) {
			if (!visited[i] && adjMatrix[current][i] != 0) {
				dfs(visited, i);
			}
		}
	}

	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<Integer>();
		boolean[] visited = new boolean[N + 1];
		que.offer(start);
		visited[start] = true;

		while (!que.isEmpty()) {
			int temp = que.poll();
			sb.append(temp).append(" ");

			for (int i = 1; i <= N; i++) {
				if (!visited[i] && adjMatrix[temp][i] > 0) {
					que.offer(i);
					visited[i] = true;
				}
			}
		}
	}
}
