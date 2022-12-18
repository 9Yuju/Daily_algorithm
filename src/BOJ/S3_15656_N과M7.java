package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S3_15656_N과M7 {
	static int[] numbers; // 입력받은 배열
	static int[] input; // 출력할 배열
	static int N, M;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		StringTokenizer st1 = new StringTokenizer(bf.readLine());

		numbers = new int[N];
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st1.nextToken());
		}
		
		Arrays.sort(numbers);
		input = new int[M]; // 뽑힌숫자

		comb(0);
		System.out.println(sb);
	}

	public static void comb(int cnt) {
		if (cnt == M) {
			for (int i : input) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < N; i++) {

			input[cnt] = numbers[i];
			comb(cnt + 1);

		}

	}
}
