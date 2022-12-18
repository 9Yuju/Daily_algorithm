package BOJ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * @author yuju
 * https://www.acmicpc.net/problem/11501
 * 
3
3
10 7 6
3
3 5 9
5
1 1 3 1 2
 */
public class S2_11501_주식 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine()); //테케수
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(bf.readLine());
			int[] arr = new int[N];
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			// 입력 끝
			
			int max = 0;
			long result = 0;
			int[] score = new int[N];
			
			
			for (int i = N-1 ; i >= 0; i--) {
				if(arr[i] > max) {
					max = arr[i];
				}else {
					result += max - arr[i];
				}
			}
			
			System.out.println(result);
			
		}// t for

	}

}

















