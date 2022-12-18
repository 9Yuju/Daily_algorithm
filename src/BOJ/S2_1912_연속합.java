package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_1912_연속합 {
	static int arr[];
	static long dp[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		arr = new int[T];
		dp = new long[T];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < T; i++) {
			int temp =Integer.parseInt(st.nextToken());
			arr[i] = temp;
			dp[i] = temp;
		}
		long max = dp[0];
		for (int i = 1; i < T; i++) {
			dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}
}
