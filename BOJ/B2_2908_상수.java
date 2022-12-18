package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_2908_상수 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		StringBuffer sb = new StringBuffer();
		sb.append(st.nextToken());
		int A = Integer.parseInt(sb.reverse().toString());
		sb.setLength(0); // 초기화
		sb.append(st.nextToken());
		int B = Integer.parseInt(sb.reverse().toString());
		if (A > B) {
			System.out.println(A);
		} else if (B > A) {
			System.out.println(B);
		}

	}
}
