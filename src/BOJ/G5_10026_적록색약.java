package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class G5_10026_적록색약 {
    static int N;
    static char[][] arr, color_arr;
    static boolean[][] visited, color_visited;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    static int number = 0, color_number = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        arr = new char[N][N];
        color_arr = new char[N][N];
        visited = new boolean[N][N];
        color_visited = new boolean[N][N];
        for (int n = 0; n < N; n++) {
            String str = bf.readLine();
            for (int m = 0; m < N; m++) {
                char c = str.charAt(m);
                arr[n][m] = c;
                if (c == 'G') {
                    color_arr[n][m] = 'R';
                } else {
                    color_arr[n][m] = c;
                }
            }
        }
        //입력끝
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                //적록색약 아닌사람
                if (!visited[i][j]) {
                    dfs(i, j, arr[i][j], visited, arr);
                    number++;
                }
                //적록색약인사람
                if (!color_visited[i][j]) {
                    dfs(i, j, color_arr[i][j], color_visited, color_arr);
                    color_number++;
                }
            }
        }
        System.out.println(number + " " + color_number);
    }

    public static void dfs(int x, int y, char c, boolean[][] visited, char[][] arr) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int next_x = x + dir[i][0];
            int next_y = y + dir[i][1];
            if (next_x >= 0 && next_x < N && next_y >= 0 && next_y < N && !visited[next_x][next_y] && arr[next_x][next_y] == c) {
                dfs(next_x, next_y, c, visited, arr);
            }
        }
    }
}
