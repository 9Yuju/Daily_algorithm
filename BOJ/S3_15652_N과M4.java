package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_15652_N과M4 {
	static int[] input;
	static int N, M;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		input = new int[M]; // 뽑힌숫자

		comb(0, 0);
		System.out.println(sb);
	}
	//중복조합
	public static void comb(int cnt, int start) {
		if (cnt == M) {
			for (int i : input) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = start; i < N; i++) {

			input[cnt] = i + 1;
			comb(cnt + 1, i);

		}

	}

}
