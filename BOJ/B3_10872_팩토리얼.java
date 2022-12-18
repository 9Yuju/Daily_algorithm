package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3_10872_팩토리얼 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		System.out.println(func(N));
	}

	public static int func(int N) {
		if (N <= 1) {
			return 1;
		}
		return N * func(N - 1);
	}
}
