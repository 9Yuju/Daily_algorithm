package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_4344_평균은넘겠지 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(bf.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < C; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			} // 값넣기
			double sum = 0, avg = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j];
			}
			avg = sum / arr.length;

			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > avg)
					count++;
			}

			double x = ((double) count / arr.length) * 100;
			sb.append(String.format("%.3f", x)).append("%").append("\n");

		} // 전체for

		System.out.println(sb);
	}
}
