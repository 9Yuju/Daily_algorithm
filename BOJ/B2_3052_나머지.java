package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class B2_3052_나머지 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = 0;

		HashSet<Integer> x = new HashSet<>(); // 중복값X

		for (int j = 0; j < 10; j++) {
			n = Integer.parseInt(bf.readLine());
			x.add(n % 42);
		}
		System.out.println(x.size());

	}
}
