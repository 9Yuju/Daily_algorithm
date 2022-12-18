package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_2579_계단오르기 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); // 계단의 개수
		int[] arr = new int[301];
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
		}
		// 점수용 배열
		int[] score = new int[301];

		// 계단 오르기
		// 3칸 밑은 따로
		score[1] = arr[1];
		score[2] = arr[1] + arr[2];
		score[3] = Math.max(arr[1], arr[2]) + arr[3]; // 3칸연속되면 안되니까

		// 3칸 위
		for (int i = 4; i <= N; i++) {
			score[i] = Math.max(score[i - 2], score[i - 3] + arr[i - 1]) + arr[i];
		}
	
		
		System.out.println(score[N]);
	}
}
