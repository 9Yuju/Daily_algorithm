package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1_2750_수정렬하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
