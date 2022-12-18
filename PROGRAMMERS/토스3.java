import java.util.*;
import java.io.*;

public class 토스3 {
	
	static int N;
	static int answer;
//	static boolean[] visited;
	
	public static void main(String[] args) {
		int[][] dungeons = { { 700, 266 }, { 111, 78 }, { 871, 655 } };
		
		int k = 966;
		N = dungeons.length;
//		visited = new boolean[N];
		answer = -1;
		
//		Arrays.sort(dungeons, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] temp1, int[] temp2) {
//                if(temp1[1] == temp2[1]) {
//                    return temp1[0] - temp2[0];
//                }
//                return temp1[1] - temp2[1];
//            }
//        });
		
		for (int i = 0; i < dungeons.length; i++) {
			int cnt = dfs(dungeons,new boolean[N], i , k);
//			System.out.println(cnt);
			answer = (answer < cnt) ? cnt : answer;
		}
		
		
		System.out.println(answer);
	}

	public static int dfs(int[][] adjMatrix,boolean[] visited, int current, int life) {
//		System.out.println(life);
		visited[current] = true;
//		cnt++;
		int cnt = 1;
//		System.out.println(current);
		// current 정점의 인접정점 처리(단, 방문하지 않은 인접정점만)
		for (int i = 0; i < N; i++) {
			if (!visited[i]  && life >=adjMatrix[i][0]) {
//				System.out.println(cnt);
				cnt++;
				dfs(adjMatrix,visited, i, life -adjMatrix[i][1]);
			}
		}
		return cnt;
	}
}

//Arrays.sort(dungeons, new Comparator<int[]>() {
//	@Override
//	public int compare(int[] temp1, int[] temp2) {
//		if(temp1[1] == temp2[1]) {
//			return temp1[0] - temp2[0];
//		}
//		return temp1[1] - temp2[1];
//	}
//});
//
////for (int[] is : dungeons) {
////	for (int is2 : is) {
////		System.out.println(is2);
////	}
////}
//
//
//int cnt = 0;
//int life = 0;
//
////System.out.println(dungeons.length);
//
//for (int i = 0; i < dungeons.length; i++) {
//	if(k >= dungeons[i][0] && life <=dungeons[i][0]) {
//		life = dungeons[i][1];
//		k -= dungeons[i][1];
//		cnt++;
//	}
//}
//
//answer = cnt;
//
//////////////////////////////
//
//Arrays.sort(dungeons, new Comparator<int[]>() {
//	@Override
//	public int compare(int[] temp1, int[] temp2) {
//		if(temp1[1] == temp2[1]) {
//			return temp2[0] - temp1[0];
//		}
//		return temp1[1] - temp2[1];
//	}
//});
//
//cnt = 0;
//life = 0;
//
////System.out.println(dungeons.length);
//
//for (int i = 0; i < dungeons.length; i++) {
//	if(k >= dungeons[i][0] && life <=dungeons[i][0]) {
//		life = dungeons[i][1];
//		k -= dungeons[i][1];
//		cnt++;
//	}
//}
//
//answer = (answer < cnt) ? cnt : answer;