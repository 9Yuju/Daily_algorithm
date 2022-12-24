package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class knight{
    int x;
    int y;
    knight(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class S1_7562_나이트의이동 {
    static int[][] arr;
    static Queue<knight> que;
    static int[][] dir = {{-1,-2},{-2,-1},{-2,1},{-1,2},{1,-2},{2,-1},{2,1},{1,2}};
    static int l;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for (int t = 0; t < T; t++) {
            l = Integer.parseInt(bf.readLine());
            arr= new int[l][l];
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            arr[sy][sx] = 1;
            st = new StringTokenizer(bf.readLine());
            int nx = Integer.parseInt(st.nextToken());
            int ny = Integer.parseInt(st.nextToken());
            if(arr[ny][nx]==1){
                System.out.println(0);
            }else {
                arr[ny][nx] = -1;
                // 입력
                que = new LinkedList<knight>();
                que.add(new knight(sx, sy));
                System.out.println(bfs());
            }

        }// t for
    }
    static int bfs(){
        while(!que.isEmpty()){
            knight temp = que.poll();
            int count = arr[temp.y][temp.x];
            for (int i = 0; i < 8; i++) {
                int nx = temp.x + dir[i][0];
                int ny = temp.y + dir[i][1];
                if (nx >= 0 && nx < l && ny >= 0 && ny < l) {
                    if(arr[ny][nx] ==-1){
                        return count;
                    }
                    if( arr[ny][nx] == 0) {
                        arr[ny][nx] = count + 1;
                        que.add(new knight(nx, ny));
                    }
                }
            }
        }
        return 0;
    }
}
