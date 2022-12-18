package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_9093_단어뒤집기 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringBuilder sb;
		StringBuilder st = new StringBuilder();
		for (int n = 0; n < N; n++) {
			String arr[] = bf.readLine().split(" ");
			for (int i = 0; i < arr.length; i++) {
				sb = new StringBuilder(arr[i]);
				st.append(sb.reverse()).append(" ");
			}
			st.append("\n");
		}
		System.out.println(st);
	}
}
