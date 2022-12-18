package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_2775_부녀회장이될테야 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		int arr[][] = new int[15][15];
		for (int i = 1; i <= 14; i++) {
			arr[0][i] = i;
			arr[i][1] = 1;
		}
		for (int i = 1; i < 15; i++) {
			for (int j = 1; j < 15; j++) {
				arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
			}
		}
		for (int tc = 0; tc < T; tc++) {
			int K = Integer.parseInt(bf.readLine());// k층
			int N = Integer.parseInt(bf.readLine());// n호
			System.out.println(arr[K][N]);
		}
	}
}
