package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2_15990_123더하기5 {
	static long arr[][] = new long[100001][4];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		arr[1][1] = 1;
		arr[2][2] = 1;
		arr[3][1] = 1;
		arr[3][2] = 1;
		arr[3][3] = 1;
		for (int i = 4; i < 100001; i++) {
			arr[i][1] = (arr[i - 1][2] + arr[i - 1][3]) % 1000000009;
			arr[i][2] = (arr[i - 2][1] + arr[i - 2][3]) % 1000000009;
			arr[i][3] = (arr[i - 3][2] + arr[i - 3][1]) % 1000000009;
		}

		for (int tc = 0; tc < T; tc++) {
			int x = Integer.parseInt(bf.readLine());
			long temp = (arr[x][1] + arr[x][2] + arr[x][3]) % 1000000009;
			System.out.println(temp);
		}
	}
}
