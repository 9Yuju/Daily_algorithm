package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_9095_123더하기 {
	static int arr[] = new int[12];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		arr[1]=1;
		arr[2]=2;
		arr[3]=4;
		for (int i = 4; i < 12; i++) {
			for (int j = 1; j < 4; j++) {
				arr[i]+=arr[i-j];
			}
		}
		
		for (int tc = 0; tc < T; tc++) {
			int x = Integer.parseInt(bf.readLine());
			System.out.println(arr[x]);
		}
		
	}
}
