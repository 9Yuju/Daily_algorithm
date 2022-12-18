package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_2577_숫자의개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bf.readLine());
		int b = Integer.parseInt(bf.readLine());
		int c = Integer.parseInt(bf.readLine());

		int n = a * b * c;

		String s = String.valueOf(n);

		int[] num = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < s.length(); j++) {
				if ((s.charAt(j) - '0') == i) {
					num[i]++;
				}
			}

		}

		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
