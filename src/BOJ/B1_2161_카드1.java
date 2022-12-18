package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B1_2161_카드1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); 
		Queue<Integer> que = new LinkedList<>();
		for (int i = 1; i <= N; i++) {
			que.add(i);
		}
		int idx =1;
		while(!que.isEmpty()) {
			if(idx%2==0) {
				int temp = que.poll();
				que.add(temp);
			}else {
				System.out.print(que.poll()+" ");
			}
			idx++;
		}
	}
}
