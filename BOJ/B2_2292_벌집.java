package Tutorial;

import java.util.Scanner;

public class B2_2292_벌집 { // 벌집

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 13
		int x = 1;
		int k = 1;
		while (x < N) {
			x += 6 * k; // x = x + 6*1 = 7
			k++;
		}
		System.out.println(k);

	}

}
