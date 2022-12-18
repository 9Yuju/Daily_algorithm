package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1_1149_RGB거리 {
	static int[][] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); // 집의 수
		StringBuilder sb = new StringBuilder();
		arr = new int[N][3];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}
		for (int i = 1; i < N; i++) {
			arr[i][0] += Math.min(arr[i - 1][1], arr[i - 1][2]);
			arr[i][1] += Math.min(arr[i - 1][0], arr[i - 1][2]);
			arr[i][2] += Math.min(arr[i - 1][0], arr[i - 1][1]);
		}
		sb.append(Math.min(Math.min(arr[N - 1][0], arr[N - 1][1]), arr[N - 1][2]));
		System.out.println(sb);
	}
}
