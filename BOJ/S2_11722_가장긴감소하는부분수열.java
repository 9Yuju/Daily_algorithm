package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_11722_가장긴감소하는부분수열 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(bf.readLine()); // 수열의 크기
		int arr[] = new int[A];
		int LIS[] = new int[A];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < A; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = 0;
		for (int i = 0; i < A; i++) {
			LIS[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[i] && LIS[i] < LIS[j] + 1) {
					LIS[i] = LIS[j] + 1;
				}
			}
			max = Math.max(max, LIS[i]);
		}
		System.out.println(max);

	}
}
