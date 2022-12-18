package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class S3_1699_제곱수의합 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int arr[] = new int[100001];
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;

		ArrayList<Integer> idx = new ArrayList<>();
		for (int i = 4; i < N + 1; i++) {
			long sqrt = (long) Math.sqrt(i);
			if (i == Math.pow(sqrt, 2)) { // 어떤 수의 제곱이라면
				arr[i] = 1;
				idx.add(i);
			} else { // 아니라면 최소구하기
				int min = Integer.MAX_VALUE;
				for (int j = 0; j < idx.size(); j++) {
					int temp = arr[i - idx.get(j)] + arr[idx.get(j)];
					min = Math.min(min, temp);
				}
				arr[i] = min;
			}
		}
		System.out.println(arr[N]);
	}
}
