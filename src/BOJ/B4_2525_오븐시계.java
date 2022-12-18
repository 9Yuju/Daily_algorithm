package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4_2525_오븐시계 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int A = Integer.parseInt(st.nextToken()); // 현재시각 시
		int B = Integer.parseInt(st.nextToken());// 분
		int C = Integer.parseInt(bf.readLine());// 요리시간

		B += C;
		if (B > 59) {
			A += B / 60;
			B = B % 60;
		}
		if (A > 23) {
			A -= 24;
		}
		System.out.println(A + " " + B);

	}

}
