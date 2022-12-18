package Tutorial;

import java.util.Scanner;

public class G4_17406_배열돌리기4 { // 배열 올리기 4
	static int[][] delta = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } }; // 하 우 상 좌
	static int input[][]; // 연산 담을 배열
	static int san[]; // 연산 순열 담을 배열
	static boolean isSelected[];
	static int N, M, K;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		int[][] arr = new int[N + 1][M + 1]; // 한칸씩 더 크게 만들어서 좌표 알기 쉽게
		int r, s, c;
		input = new int[K][3];
		san = new int[K];
		isSelected = new boolean[K];
		// 입력
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		// 연산 순열
		for (int k = 0; k < K; k++) { // 연산 배열에 연산 넣기
			input[k][0] = sc.nextInt(); // r
			input[k][1] = sc.nextInt(); // c
			input[k][2] = sc.nextInt(); // s
		}
	
		// 순열 ... 
		permutation(0); // 하고나면 san 배열에 순열 저장되어있다.
		
//		for (int is : san) {
//			System.out.println(is);
//		}

		r = sc.nextInt();
		c = sc.nextInt();
		s = sc.nextInt();
		
		// 

		// (r-s,c-s) (r+s,c+s)
		for (int k = 0; k < K; k++) { // 연산 횟수

			for (int p = 0; p < s; p++) { // 박스 몇개나 반복인지
				int x = r - s + p;
				int y = c - s + p;

				int temp = arr[x][y];
				int fw = 0; // 방향값 0 하 1 우 2 상 3좌

				while (fw < 4) {
					int dx = x + delta[fw][0];
					int dy = y + delta[fw][1];

					if (dx >= r - s + p && dy >= c - s + p && dx <= r + s - p && dy <= c + s - p) {
						arr[x][y] = arr[dx][dy];
						x = dx;
						y = dy;
					} else
						fw++;
				}
				arr[r - s + p][c - s + p + 1] = temp; // 빼놓은 값 넣기

			}

		} // for

		// 최소값 찾고 출력
		int min = 999;
		int sum = 0;
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			if (sum < min)
				min = sum;
			sum = 0;
		}
		System.out.println(min);
	} // main

	public static void permutation(int cnt) {
		if (cnt == K) {
			return;
		}
		
		for (int k = 0; k < K; k++) { // 0 ~6
			if (isSelected[k])
				continue;

			san[cnt] = k;
			isSelected[k] = true;
			permutation(cnt + 1);
			isSelected[k] = false;
		}
	}

}
