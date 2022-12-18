package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_1193_분수찾기 { //잘모르겠음

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int count = 1;
		int sum = 0;
		while (true) {
			if (N <= sum + count) {
				if (count % 2 == 1) {
					System.out.print((count - (N - sum - 1)) + "/" + (N - sum));
					break;
				} else {
					System.out.print((N - sum) + "/" + (count - (N - sum - 1)));
					break;
				}
			} else {
				sum += count;
				count++;
			}
		}
	}
}
