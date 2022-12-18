package BOJ;


/**
 * https://www.acmicpc.net/problem/2891
 * 
5 2 1
2 4
3
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_2891_카약과강풍 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken()); // 팀의 수
		int S = Integer.parseInt(st.nextToken()); // 손상된팀
		int R = Integer.parseInt(st.nextToken()); // 더가져온팀
		int[] arr = new int[N];
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < S; i++) {
			int k = Integer.parseInt(st.nextToken());
			arr[k-1] = -1;
		}
		st = new StringTokenizer(bf.readLine());
		for (int i = 0; i < R; i++) {
			int k = Integer.parseInt(st.nextToken());
			if(arr[k-1]==-1) {
				arr[k-1]=0;
			}else arr[k-1] = 1;
		}

		// 입력 끝
		int count = 0;

		for (int i = 0; i < N; i++) {
			if (arr[i] == -1) {
				count ++;
				if (i > 0 && arr[i - 1] == 1) {
					count --;
					arr[i] = 0;
					arr[i-1] = 0;
				} else if (i < N-1 && arr[i + 1] == 1) {
					count --;
					arr[i] = 0;
					arr[i+1] = 0;
				}
			}
		}
		
		System.out.println(count);
	}

}
