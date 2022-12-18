package Tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class S5_11650_좌표정렬하기 { 
	// 좌표정렬하기
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int[][] arr = new int[N][2];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		// Arrays.sort(arr); <1차원배열용

//		Arrays.sort(arr, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				// TODO Auto-generated method stub
//				if(o1[0]==o2[0]) { //x좌표값이 같으면
//					return 
//				}
//				
//				
//				
//			}
//			
//			
//			
//		});

		// 출력
		for (int i = 0; i < N; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1] + "\n");
		}

	}
}
