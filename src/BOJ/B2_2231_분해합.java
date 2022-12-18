package BOJ;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_2231_분해합 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());

		int min = N;
		for (int i = N - 1; i > 0; i--) {
			int sum = i;
			int x = i;
			while (true) {
				sum += x % 10;
				if (x < 10)
					break;
				x /= 10;
			}
			if (sum == N) {
				min = Math.min(min, i);
			}
		}

		if (min == N) {
			System.out.println("0");
		} else {
			System.out.println(min);
		}
	}

}
