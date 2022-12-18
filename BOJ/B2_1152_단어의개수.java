package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2_1152_단어의개수 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str[] = bf.readLine().trim().split(" ");
		// 예외 공백만 들어올경우

		if (str.length == 1 && str[0].isEmpty()) {

			System.out.println("0");

		} else {
			System.out.println(str.length);
		}

	}
}
