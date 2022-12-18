package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S4_1978_소수찾기 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		boolean arr[] = new boolean[1001];
		arr[1]=true;
		for (int i = 2; i < 1001; i++) {
			int k = 2;
			while (true) {
				if (i * k > 1000)
					break;
				if (arr[i * k] == false) {
					arr[i * k] = true;
				}
				k++;
			}
		}
		int count = 0;
		for (int t = 0; t < T; t++) {
			int temp = Integer.parseInt(st.nextToken());
			if(arr[temp]==false) {
				count++;
			}
		}
		System.out.println(count);
	}
}
