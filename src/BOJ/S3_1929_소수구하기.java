package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_1929_소수구하기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		boolean arr[] = new boolean[N+1];
		arr[1] = true;
		for (int i = 2; i <= N; i++) {
			int k = 2;
			while (true) {
				if (i * k > N)
					break;
				if (arr[i * k] == false) {
					arr[i * k] = true;
				}
				k++;
			}
		}
		for (int t = M; t <= N; t++) {
			if (arr[t] == false) {
				System.out.println(t);
			}
		}
	}
}
