package Tutorial;

import java.util.Scanner;

public class B4_2480_주사위세개 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		int money = 0;
		if (x == y & x == z) { // 같은눈3개
			money = x * 1000 + 10000;
		} else if (x != y & y != z & x != z) {
			money = 100 * Math.max(Math.max(x, y), z);
		} else {
			if (x == y) {
				money = 1000 + x * 100;
			} else if (y == z) {
				money = 1000 + y * 100;
			} else if (z == x) {
				money = 1000 + z * 100;
			}
		}
		System.out.println(money);

	}

}
