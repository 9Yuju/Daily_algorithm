package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_4963_섬의개수 {

    static int[][] dir = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
    static int[][] arr;
    static int w, h;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            int count = 0;
            if (w == 0 && h == 0) { // 0 0 이 들어오면 멈추기
                break;
            }

            arr = new int[w][h];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(bf.readLine());
                for (int j = 0; j < w; j++) {
                    arr[j][i] = Integer.parseInt(st.nextToken());
                }
            }
            //dfs
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (arr[j][i] == 1) {
                        dfs(j, i);
                        count++;
                    }
                }
            }

            //출력
            sb.append(count).append("\n");

        }
        System.out.println(sb);
    }

    static void dfs(int x, int y) {
        arr[x][y] = 0;
        for (int i = 0; i < 8; i++) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];
            if (nx >= 0 && nx < w && ny >= 0 && ny < h && arr[nx][ny] == 1) {
                dfs(nx, ny);
            }
        }
    }
}
