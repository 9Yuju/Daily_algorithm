package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_2193_이친수 {
	static long arr[] = new long[91];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		
		arr[1]=1;
		arr[2]=1;
		arr[3]=2;
		for (int i = 4; i < 91; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println(arr[T]);
	}
}
