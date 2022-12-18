package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4_1065_한수 { // 한수
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());// 123

		int count = 0;

		for (int i = 1; i <= N; i++) {
			if (i < 100) { // 100 밑의 한수 99개
				count++;
			}else if(i == 1000){
				break;
			}else { // 100~999
				if(hansu(i)==1) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

	public static int hansu(int N) {
		int x = 0, y = 0, z = 0;

		x = N % 10; // 3
		y = (N / 10) % 10; // 2
		z = (N / 100) % 10; // 1

		if (x - y == y - z) {
			return 1;
		} else
			return -1;

	}
}
