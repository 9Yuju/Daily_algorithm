package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_1463_1로만들기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int dp[] = new int[N + 1];
		dp[1] = 0;
		if (N > 1) {
			dp[2] = 1;
		}
		if (N > 2) {
			dp[3] = 1;
		}
		for (int i = 4; i < dp.length; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				dp[i] = Math.min(1 + dp[i / 2], 1 + dp[i / 3]);
			} else if (i % 2 == 0) {
				dp[i] = Math.min(1 + dp[i / 2], 1 + dp[i - 1]);
			} else if (i % 3 == 0) {
				dp[i] = Math.min(1 + dp[i / 3], 1 + dp[i - 1]);
			} else {
				dp[i] = 1 + dp[i - 1];
			}
		}
		System.out.println(dp[N]);
	}
}
