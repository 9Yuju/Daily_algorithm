package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_1018_체스판다시칠하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] arr = new char[N][M];
		for (int n = 0; n < N; n++) {
			arr[n] = bf.readLine().toCharArray();
		}
		int minCount = 65;
		for (int k = 0; k < N - 7; k++) {
			for (int q = 0; q < M - 7; q++) {
				int bCount = 0; // 첫칸이 b인
				int wCount = 0; // 첫칸이 w인

				for (int i = k; i < k + 8; i++) {
					for (int j = q; j < q + 8; j++) {
						if ((i+j) % 2 == 0) {
							if(arr[i][j]=='B') wCount++;
							else bCount++;
						} else {
							if(arr[i][j]=='W') wCount++;
							else bCount++;
						}
					} // i for
				} // j for

				int tempCount = Math.min(wCount, bCount);
				minCount = Math.min(tempCount, minCount);
			} // q for
		} // k for
		System.out.println(minCount);
	}
}
