package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_2644_촌수계산 {
    static int[][] arr;
    static int m, max_count, b;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(bf.readLine());
        arr = new int[m][3];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = 0; //방문한적없음
        }

        //입력끝
        max_count=-1;
        for (int i = 0; i < m; i++) {
            if(arr[i][0] == a){
                dfs(i,arr[i][1],0);
//                max_count = Math.max(max_count,count);
//                System.out.println("----------------------------------------");
            }
            if(arr[i][1] == a){
                dfs(i,arr[i][0],0);

//                System.out.println("----------------------------------------");
            }
        }
        System.out.println(max_count);

    }
    static void dfs(int i, int temp, int count){
//        System.out.println("dfs 들어옴 i:"+i+" / temp:"+temp);
        //방문체크
        arr[i][2] = 1;
        count++;

        if(arr[i][0] == b || arr[i][1] == b){
            max_count = Math.max(max_count,count);
//            System.out.println("나가!!!");
            return;
        }
        for (int j = 0; j < m; j++) {
            if(arr[j][0] == temp && arr[j][2] != 1){
                dfs(j,arr[j][1],count);
            }
            if(arr[j][1] == temp && arr[j][2] != 1){
                dfs(j,arr[j][0],count);
            }
        }
        count = -1;

        //dfs 빠져나올때 방문체크 풀수있나?
        arr[i][2] = 0;
    }
}
