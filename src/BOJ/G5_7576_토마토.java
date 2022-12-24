package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class G5_7576_토마토 {
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int[][] arr;
    static int M, N, day;
    static Queue<int[]> que;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        que = new LinkedList<>();
        for (int n = 0; n < N; n++) {
            st = new StringTokenizer(bf.readLine());
            for (int m = 0; m < M; m++) {
                arr[n][m] = Integer.parseInt(st.nextToken());
                if (arr[n][m] == 1) {
                    que.add(new int[]{n, m});
                }
            }
        }
        //입력
        que.add(new int[]{-1, -1}); // 하루 측정용
        bfs();
        boolean ok = true;
        L: for (int n = 0; n < N; n++) {
            for (int m = 0; m < M; m++) {
               if(arr[n][m]==0){
                   ok = false;
                   break L;
               }
            }
        }
        System.out.println(ok? day : "-1");
    }

    static void bfs() {
        while (!que.isEmpty()) {
            int[] temp = que.poll();
            int x = temp[1];
            int y = temp[0];
//            System.out.println("que poll // {" + y + ", " + x + "}");
            if (x == -1 && y == -1 && !que.isEmpty()) {
                que.add(new int[]{-1, -1});
                day++;
            } else {
                for (int i = 0; i < 4; i++) {
                    int nx = x + dir[i][0]; //{ny,nx}
                    int ny = y + dir[i][1];
                    if (nx >= 0 && nx < M && ny >= 0 && ny < N && arr[ny][nx] == 0) {
                        arr[ny][nx] = 1;
                        que.add(new int[]{ny, nx});
                    }
                }
            }
        }

    }
}
