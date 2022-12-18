package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1_1157_단어공부 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 단어 입력

		String str = bf.readLine();

		int[] ch = new int[26];

		// 개수 세기
		for (int j = 0; j < ch.length; j++) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == (j + 65) | str.charAt(i) == (j + 97)) {
					ch[j]++;
				}
			}
		} // for

		// 가장많은거 출력
		int max = ch[0];
		int index = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > max) {
				max = ch[i];
				index = i;
			}
		}
		char x = (char) (index + 65);
		sb.append(x);
		// 최대가 중복
		for (int i = 0; i < ch.length; i++) {
			if (i != index) {
				if (ch[i] == max) {
					sb.setLength(0);
					sb.append("?");
				}
			}
		}

		System.out.println(sb);

	}

}
