package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S1_2178_미로탐색 {
    static int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
//    static int min = Integer.MAX_VALUE;
    static int N,M;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=  new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        for (int n = 0; n < N; n++) {
            String str = bf.readLine();
            for (int m = 0; m < M; m++) {
                arr[n][m] =Character.getNumericValue(str.charAt(m));
            }
        }
        bfs();
        System.out.println(arr[N-1][M-1]);
    }
    static void bfs(){
        Queue<int[]> que = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        que.add(new int[]{0,0});
        visited[0][0] = true;

        while(!que.isEmpty()){
            int[] temp = que.poll();
            int x = temp[0];
            int y = temp[1];
            int count = arr[x][y];
            if(x==N-1 && y == M-1){
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dir[i][0];
                int ny = y + dir[i][1];
                if(nx>=0 && nx<N && ny>=0 && ny<M && arr[nx][ny]!=0 && visited[nx][ny] == false){
                    arr[nx][ny]=(arr[nx][ny] ==1 )? count+1 : Math.min(count+1,arr[nx][ny]);
                    que.add(new int[]{nx,ny});
                    visited[nx][ny] = true;
                }
            }
        }
    }
}
