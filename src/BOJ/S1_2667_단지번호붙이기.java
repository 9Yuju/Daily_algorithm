package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class S1_2667_단지번호붙이기 {

    static int[][] arr;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int N, count;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            String str = bf.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        int total_count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) {
                    count = 0;
                    total_count++;
                    dfs(i, j);
                    list.add(count);
                }
            }
        }
        Collections.sort(list);
        System.out.println(total_count);
        for (int a:
             list) {
            System.out.println(a);
        }
    }

    static void dfs(int x, int y) {
        arr[x][y] = 0;
        count++;
        for (int i = 0; i < 4; i++) {
            int next_x = x + dir[i][0];
            int next_y = y + dir[i][1];
            if (next_x >= 0 && next_x < N && next_y >= 0 && next_y < N && arr[next_x][next_y] == 1) {
                dfs(next_x, next_y);
            }
        }
    }
}
