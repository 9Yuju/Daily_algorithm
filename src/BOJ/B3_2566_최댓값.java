package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_2566_최댓값 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=  new BufferedReader(new InputStreamReader(System.in));
        int max = -1;
        int x = 1;
        int y = 1;
        for (int i = 1; i <10; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int j = 1; j < 10; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if(max < temp){
                    max = temp;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(x+" "+y);
    }
}
