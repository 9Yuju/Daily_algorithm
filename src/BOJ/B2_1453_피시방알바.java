package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_1453_피시방알바 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		boolean [] arr = new boolean[101];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int count=0;
		for (int n = 0; n < N; n++) {
			int temp = Integer.parseInt(st.nextToken());
			if(arr[temp]==true){
				count++;
			}else {
				arr[temp]=true;
			}
		}
		System.out.println(count);
	}

}
