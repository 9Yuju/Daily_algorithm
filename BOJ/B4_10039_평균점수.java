package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4_10039_평균점수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int temp = Integer.parseInt(bf.readLine());
			if (temp < 40)
				temp = 40;
			sum += temp;
		}
		System.out.println(sum / 5);
	}
}
