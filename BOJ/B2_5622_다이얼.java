package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_5622_다이얼 { //다이얼 , 숫자로 안바꾸고 풀어도 되는데..
	public static void main(String[] args) throws IOException {

		int num[] = { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 번호별로 걸리는 시간

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		char c;
		int time = 0;

		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			int a = (int) c;
			if (a <=67) { // 1 A는 65
				time += num[2];
			} else if (68 <= a & a <= 70) { // 2 68 69 70
				time += num[3];
			} else if (71 <= a & a <= 73) { // 71 72 73
				time += num[4];
			} else if (74 <= a & a <= 76) { // 74 75 76
				time += num[5];
			} else if (77 <= a & a <= 79) { // 76 77 78
				time += num[6];
			} else if (80 <= a & a <= 83) {
				time += num[7];
			} else if (84 <= a & a <= 86) {
				time += num[8];
			} else if (87 <= a & a <= 90) {
				time += num[9];
			} else {
				time += num[0]; // 11
			}
		}

		System.out.println(time);

	}
}
