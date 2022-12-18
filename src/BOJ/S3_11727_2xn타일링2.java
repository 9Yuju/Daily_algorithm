package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_11727_2xn타일링2 {
	static long arr[] = new long[1001];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		arr[1] = 1;
		arr[2] = 3;
		arr[3] = 5;
		for (int i = 4; i < 1001; i++) {
			arr[i] = (arr[i-1]+2*arr[i-2])%10007;
		}
		System.out.println(arr[T]);
	}
}
